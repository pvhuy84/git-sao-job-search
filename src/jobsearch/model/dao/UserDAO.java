package jobsearch.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobsearch.entity.Notification;
import jobsearch.model.bean.Jobseeker;
import jobsearch.model.bean.Recruiter;
import jobsearch.model.bean.User;

public class UserDAO extends DatabaseFactory {
	String sql = "";

	// Kiem tra dang nhap
	public Notification checkUser(String email, String password) {
		sql = "SELECT * FROM user WHERE email=? and password=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				if (rs.getInt(3) == 0) {
					return (new Notification("success", "you is jobseeker"));
				} else {
					return (new Notification("success", "you is recruiter"));
				}
			} else {
				preparedStatement.close();
				return (new Notification("error", "Invalid email or password!"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
	}

	// Lay thong tin nguoi dang nhap la Jobseeker
	public Jobseeker getUserJobseeker(String email) {
		sql = "SELECT * FROM jobseeker WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				return new Jobseeker(rs.getInt("jobseekerId"), rs.getString("fullname"), rs.getString("email"),
						rs.getDate("birthday"), rs.getInt("gender"), rs.getInt("status"), rs.getString("phonenumber"));
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// Lay thong tin nguoi dang nhap la Recruiter
		public Recruiter getUserRecruiter(String email) {
			sql = "SELECT * FROM recruiter WHERE email=?";
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, email);
				ResultSet rs = preparedStatement.executeQuery();
				if (rs.next()) {
					return new Recruiter(rs.getInt("recruiterId"), rs.getString("email"), rs.getString("name"), rs.getString("detail"),
							rs.getString("address"), rs.getString("provinceId"), rs.getString("phonenumber"), rs.getString("website"), rs.getInt("scale"));
				}
				return null;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}

	// Them user la jobseeker
	public Notification addUserJobseeker(String email, String password, String fullname, String phonenumber) {
		int usertype = 0;
		sql = "SELECT * FROM user WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
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
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			preparedStatement.setInt(3, usertype);
			if (preparedStatement.execute()) {
				preparedStatement.close();
				return (new Notification("error", "Database error!"));
			} else {
				sql = "INSERT INTO jobseeker(fullname, email, phonenumber) VALUES(?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, fullname);
				preparedStatement.setString(2, email);
				preparedStatement.setString(3, phonenumber);
				if (!preparedStatement.execute()) {
					preparedStatement.close();
					return (new Notification("success", "Add successful new user!"));
				}
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
		return (new Notification("error", "Database error!"));
	}

	// Them user la recruiter
	public Notification addUserRecruiter(Recruiter recruiter, String password) {
		int usertype = 1;
		sql = "SELECT * FROM user WHERE email=?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, recruiter.getEmail());
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
			preparedStatement.setString(1, recruiter.getEmail());
			preparedStatement.setString(2, password);
			preparedStatement.setInt(3, usertype);
			if (preparedStatement.execute()) {
				preparedStatement.close();
				return (new Notification("error", "Database error!"));
			} else {
				sql = "INSERT INTO recruiter(email, name, detail, address, provinceId, phonenumber, website, scale) VALUES(?,?,?,?,?,?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, recruiter.getEmail());
				preparedStatement.setString(2, recruiter.getName());
				preparedStatement.setString(3, recruiter.getDetail());
				preparedStatement.setString(4, recruiter.getAddress());
				preparedStatement.setString(5, recruiter.getProvinceId());
				preparedStatement.setString(6, recruiter.getPhonenumber());
				preparedStatement.setString(7, recruiter.getWebsite());
				preparedStatement.setInt(8, recruiter.getScale());
				if (!preparedStatement.execute()) {
					preparedStatement.close();
					return (new Notification("success", "Add successful new user!"));
				}
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return (new Notification("error", "Database error!"));
		}
		return (new Notification("error", "Database error!"));
	}

	/*
	 * 
	 * 
	 */

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

}
