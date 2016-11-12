package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class User{

	private String email;
	private String password;
	private int usertype;

	public User() {

	}

	public User(String email, String password, int usertype) {
		super();
		this.email = email;
		this.password = password;
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("email", email);
			obj.put("password", password);
			obj.put("usertype", usertype);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
