package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Salary {
	private int salaryId;
	private String salaryrange;
	public Salary() {
	}
	public Salary(int salaryId, String salaryrange) {
		this.salaryId = salaryId;
		this.salaryrange = salaryrange;
	}
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public String getSalaryrange() {
		return salaryrange;
	}
	public void setSalaryrange(String salaryrange) {
		this.salaryrange = salaryrange;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("salaryId", salaryId);
			obj.put("salaryrange", salaryrange);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
