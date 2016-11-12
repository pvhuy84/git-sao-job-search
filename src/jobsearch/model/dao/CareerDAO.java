package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobsearch.model.bean.Career;

public class CareerDAO extends DatabaseFactory {
	String sql="";
	
	//lay danh sach career
	public ArrayList<Career> getListCareer(){
		ArrayList<Career> listCareer = new ArrayList<Career>();
		sql="SELECT * FROM career";
		try {
			preparedStatement=connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()){
				listCareer.add(new Career(rs.getString(1), rs.getString(2)));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listCareer;
	}
	
	//Them 1 career vao co so du lieu
		public boolean addCareer(Career career) {
			sql = "INSERT INTO career VALUES('?','?')";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, career.getCareerId());
				preparedStatement.setString(2, career.getCareerName());
				if(preparedStatement.execute()){
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
		
}
