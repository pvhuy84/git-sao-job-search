package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Jobskill {
    private String jobskillId;
    private String jobskill;
    private String categoryId;

    public Jobskill() {
    }

	public Jobskill(String jobskillId, String jobskill, String categoryId) {
		this.jobskillId = jobskillId;
		this.jobskill = jobskill;
		this.categoryId = categoryId;
	}

	public String getJobskillId() {
		return jobskillId;
	}

	public void setJobskillId(String jobskillId) {
		this.jobskillId = jobskillId;
	}

	public String getJobskill() {
		return jobskill;
	}

	public void setJobskill(String jobskill) {
		this.jobskill = jobskill;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("jobskillId", jobskillId);
			obj.put("jobskill", jobskill);
			obj.put("categoryId", categoryId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
