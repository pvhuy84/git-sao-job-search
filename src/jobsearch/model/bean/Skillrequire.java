package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Skillrequire {
	private int scruitmentId;
	private String jobskillId;
	public Skillrequire() {
	}
	public Skillrequire(int scruitmentId, String jobskillId) {
		this.scruitmentId = scruitmentId;
		this.jobskillId = jobskillId;
	}
	public int getScruitmentId() {
		return scruitmentId;
	}
	public void setScruitmentId(int scruitmentId) {
		this.scruitmentId = scruitmentId;
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
			obj.put("scruitmentId", scruitmentId);
			obj.put("jobskillId", jobskillId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
