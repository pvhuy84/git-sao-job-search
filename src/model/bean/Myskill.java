package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Myskill {
	private int cvId;
	private String jobskillId;
	public Myskill() {
	}
	public Myskill(int cvId, String jobskillId) {
		this.cvId = cvId;
		this.jobskillId = jobskillId;
	}
	public int getCvId() {
		return cvId;
	}
	public void setCvId(int cvId) {
		this.cvId = cvId;
	}
	public String getJobskillId() {
		return jobskillId;
	}
	public void setJobskillId(String jobskillId) {
		this.jobskillId = jobskillId;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("cvId", cvId);
			obj.put("jobskillId", jobskillId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
