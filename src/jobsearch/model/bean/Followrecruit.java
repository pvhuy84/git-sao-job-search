/**
 * 
 */
package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Huy
 *
 */
public class Followrecruit {
	private int recruitertId;
	private int jobseekerId;
	public Followrecruit() {
	}
	public Followrecruit(int recruitertId, int jobseekerId) {
		this.recruitertId = recruitertId;
		this.jobseekerId = jobseekerId;
	}
	public int getRecruitertId() {
		return recruitertId;
	}
	public void setRecruitertId(int recruitertId) {
		this.recruitertId = recruitertId;
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
			obj.put("recruitertId", recruitertId);
			obj.put("jobseekerId", jobseekerId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
