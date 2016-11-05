package model.bean;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class Jobseeker  {
    private int jobseekerId;
    private String fullname;
    private String email;
    private Date birthday;
    private int gender;
    private int status;

    public Jobseeker() {
    }

	public Jobseeker(int jobseekerId, String fullname, String email, Date birthday, int gender, int status) {
		this.jobseekerId = jobseekerId;
		this.fullname = fullname;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.status = status;
	}

	public int getJobseekerId() {
		return jobseekerId;
	}

	public void setJobseekerId(int jobseekerId) {
		this.jobseekerId = jobseekerId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("jobseekerId", jobseekerId);
			obj.put("fullname", fullname);
			obj.put("email", email);
			obj.put("birthday", birthday);
			obj.put("gender", gender);
			obj.put("status", status);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
    
}
