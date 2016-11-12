package jobsearch.model.bo;

import java.util.ArrayList;

import jobsearch.entity.Notification;
import jobsearch.model.bean.User;
import jobsearch.model.dao.UserDAO;

public class UserBO {
	
	UserDAO userDAO = new UserDAO();
	
	public Notification addUser(User user) {
		return userDAO.addUser(user);
	}
	
	public ArrayList<User> getListUser() {
		return userDAO.getListUser();
	}

	public Notification editUser(User user) {
		return userDAO.editUser(user);
	}
	
	public Notification deleteUser(String username) {
		return userDAO.deleteUser(username);
	}

	public Notification checkUser(String username, String password) {
		return userDAO.checkUser(username, password);
	}

}
