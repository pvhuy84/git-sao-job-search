/**
 * 
 */
package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobsearch.model.bean.District;
import jobsearch.model.bean.Province;

/**
 * @author pvhuy84
 *
 */
public class DistrictDAO extends DatabaseFactory {

	public ArrayList<District> getListDistrict(String provinceid) {
		ArrayList<District> listDistrict = new ArrayList<>();
		String sql = "SELECT * FROM district WHERE 	provinceid='"+provinceid+"'";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				listDistrict.add(new District(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listDistrict;
	}

}
