package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobsearch.model.bean.Cv;

public class CvDAO extends DatabaseFactory {
	String sql = "";

	// Them 1 cv vao co so du lieu
	public boolean addCv(Cv cv) {
		sql = "INSERT INTO cv VALUES('?','?','?','?','?','?','?','?')";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, cv.getCvId());
			preparedStatement.setInt(2, cv.getCandidateId());
			preparedStatement.setInt(3, cv.getPhonenumber());
			preparedStatement.setInt(4, cv.getAge());
			preparedStatement.setInt(5, cv.getGender());
			preparedStatement.setString(6, cv.getCareerId());
			preparedStatement.setString(7, cv.getQualification());
			preparedStatement.setString(8, cv.getExperience());
			if (preparedStatement.execute()) {
				preparedStatement.close();
				return true;
			}
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// lay danh sach cv
	public ArrayList<Cv> getListCv() {
		ArrayList<Cv> listCv = new ArrayList<Cv>();
		sql = "SELECT * FROM cv";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery(sql);
			while (rs.next()) {
				listCv.add(new Cv(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6),
						rs.getString(7), rs.getString(8)));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listCv;
	}
}
