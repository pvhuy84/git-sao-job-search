package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import jobsearch.entity.Notification;
import jobsearch.model.bean.Jobseeker;

public class JobseekerDAO extends DatabaseFactory {
	private String sql = "";

	public Notification addJobseeker(Jobseeker jobseeker) {
		sql = "SELECT * FROM jobseeker WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, jobseeker.getEmail());
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				preparedStatement.close();
				return (new Notification("error", "Email exist!"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		sql = "INSERT INTO jobseeker(fullname, email, phonenumber) VALUES(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, jobseeker.getFullname());
			preparedStatement.setString(2, jobseeker.getEmail());
			preparedStatement.setString(3, jobseeker.getPhonenumber());
			if (!preparedStatement.execute()) {
				preparedStatement.close();
				return (new Notification("success", "Add successful new user!"));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
		return (new Notification("error", "Database error!"));
	}

}
