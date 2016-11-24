/**
 * 
 */
package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobsearch.model.bean.Province;

/**
 * @author pvhuy84
 *
 */
public class ProvinceDAO extends DatabaseFactory {
	public ArrayList<Province> getAllProvince() {
		ArrayList<Province> allProvince = new ArrayList<>();
		String sql = "SELECT * FROM province";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				allProvince.add(new Province(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allProvince;
	}
}
