package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Education {
    private String educationId;
    private int jobseekerId;
    private String subject;
    private String school;
    private int type;

    public Education() {
    }

    public Education(String educationId, int jobseekerId, String subject, String school, int type) {
		this.educationId = educationId;
		this.jobseekerId = jobseekerId;
		this.subject = subject;
		this.school = school;
		this.type = type;
	}



	public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getJobseekerId() {
        return jobseekerId;
    }

    public void setJobseekerId(int jobseekerId) {
        this.jobseekerId = jobseekerId;
    }
    public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("educationId", educationId);
			obj.put("jobseekerId", jobseekerId);
			obj.put("subject", subject);
			obj.put("school", school);
			obj.put("type", type);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
