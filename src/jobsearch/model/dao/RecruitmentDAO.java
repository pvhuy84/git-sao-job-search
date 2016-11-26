/**
 * 
 */
package jobsearch.model.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import jobsearch.entity.Notification;
import jobsearch.model.bean.Recruitment;
import jobsearch.model.bean.ResultSearchRecruitment;

/**
 * @author pvhuy84
 *
 */
public class RecruitmentDAO extends DatabaseFactory {

	public Notification postRecruitment(int recruiterId, String position, String content, String requirement,
			String dateend, String provinceId, String categoryId) {
		Calendar calendar = Calendar.getInstance();
		String today = calendar.get(Calendar.DATE) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/"
				+ calendar.get(Calendar.YEAR);
		Date sqlToday = Date.valueOf(
				today.substring(6, today.length()) + "-" + today.substring(3, 5) + "-" + today.substring(0, 2));
		System.out.println("String day: " + dateend);
		Date sqlDateend = Date.valueOf(
				dateend.substring(6, dateend.length()) + "-" + dateend.substring(0, 2) + "-" + dateend.substring(3, 5));
		System.out.println("String sqlday: " + sqlDateend.toString());
		String sql = "INSERT INTO `recruitment` (`recruiterId`, `position`, `content`, `requirement`, `datestart`, `dateend`, `provinceId`, `categoryId`) VALUES (?,?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, recruiterId);
			preparedStatement.setString(2, position);
			preparedStatement.setString(3, content);
			preparedStatement.setString(4, requirement);
			preparedStatement.setDate(5, sqlToday);
			preparedStatement.setDate(6, sqlDateend);
			preparedStatement.setString(7, provinceId);
			preparedStatement.setString(8, categoryId);

			if (preparedStatement.execute()) {
				preparedStatement.close();
				return (new Notification("error", "Database error!"));
			} else {
				preparedStatement.close();
				return (new Notification("success", "Post successful!"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
	}

	public ArrayList<ResultSearchRecruitment> searchRecruitment(String option, String categoryid, String provinceid) {
		ArrayList<ResultSearchRecruitment> resultSearch = new ArrayList<>();
		String sql = "";
		String conCategoryid="AND province.provinceId = ?";
		String conProvinceid="AND recruitment.categoryId = ?";
		if ("null".equals(categoryid)) {
			conCategoryid="";
		}
		if ("null".equals(provinceid)) {
			conProvinceid="";
		}
		sql = "SELECT recruitment.recruimentId, recruiter.recruiterId, recruiter.name, recruitment.position, recruitment.content, recruitment.requirement, recruitment.datestart, recruitment.dateend, province.provinceName FROM recruitment LEFT JOIN recruiter ON recruitment.recruiterId = recruiter.recruiterId LEFT JOIN province ON province.provinceId = recruitment.provinceId WHERE (recruitment.position LIKE '%"
				+ option + "%' OR recruitment.content LIKE '%" + option
				+ "%') "+conCategoryid+" "+conProvinceid+" ORDER BY recruitment.datestart DESC";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, provinceid);
			preparedStatement.setString(2, categoryid);
			System.out.println("tim recriutment: " + preparedStatement.toString());
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				resultSearch.add(new ResultSearchRecruitment(rs.getInt("recruimentId"), rs.getInt("recruiterId"),
						rs.getString("name"), rs.getString("position"), rs.getString("content"),
						rs.getString("requirement"), rs.getDate("datestart"), rs.getDate("dateend"),
						rs.getString("provinceName")));
			}
			return resultSearch;
		} catch (SQLException e) {
			e.printStackTrace();
			return resultSearch;
		}
	}

}
