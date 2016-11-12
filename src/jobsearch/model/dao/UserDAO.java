package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobsearch.entity.Notification;
import jobsearch.model.bean.User;

public class UserDAO extends DatabaseFactory {
	String sql = "";

	// lay danh sach user
	public ArrayList<User> getListUser() {
		ArrayList<User> listUser = new ArrayList<User>();
		sql = "SELECT * FROM user";
		try {
			preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				listUser.add(new User(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listUser;
	}

	// Them 1 user vao co so du lieu
	public Notification addUser(User user) {
		sql = "SELECT * FROM user WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getEmail());
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				preparedStatement.close();
				return (new Notification("error", "Email exist!"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		sql = "INSERT INTO user VALUES(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setInt(3, user.getUsertype());
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

	// Cap nhat user
	public Notification editUser(User user) {
		sql = "SELECT * FROM user WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getEmail());
			ResultSet rs = preparedStatement.executeQuery();
			if (!rs.next()) {
				return (new Notification("error", "Email not exist!"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		sql = "UPDATE user SET usertype = ?,password = ? WHERE email = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, user.getUsertype());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());
			if (!preparedStatement.execute()) {
				preparedStatement.close();
				return (new Notification("success", "Edit user successful!"));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
		return (new Notification("error", "Database error!"));
	}

	// Xoa user
	public Notification deleteUser(String email) {
		sql = "SELECT * FROM user WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			if (!rs.next()) {
				return (new Notification("error", "Email not exist!"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		sql = "DELETE FROM user WHERE email = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			if (!preparedStatement.execute()) {
				preparedStatement.close();
				return (new Notification("success", "Delete user successful!"));
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
		return (new Notification("error", "Database error!"));
	}

	// Kiem tra user
	public Notification checkUser(String email, String password) {
		sql = "SELECT * FROM user WHERE email=? and password=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				preparedStatement.close();
				return (new Notification("success", "Login successful!"));
			} else {
				preparedStatement.close();
				return (new Notification("error", "Invalid email or password!"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
	}
}
