package jobsearch.model.bean;

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
    private String phonenumber;

    public Jobseeker() {
    }

	public Jobseeker( String fullname, String email, Date birthday, int gender, int status, String phonenumber) {
		this.fullname = fullname;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.status = status;
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
			obj.put("phonenumber", phonenumber);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
    
}
