package model.bo;

import java.util.ArrayList;

import entity.Notification;
import model.bean.User;
import model.dao.UserDAO;

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
