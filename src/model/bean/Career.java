package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Career {
	private String careerId;
	private String careerName;
	public Career(String careerId, String careerName) {
		super();
		this.careerId = careerId;
		this.careerName = careerName;
	}
	public String getCareerId() {
		return careerId;
	}
	public void setCareerId(String careerId) {
		this.careerId = careerId;
	}
	public String getCareerName() {
		return careerName;
	}
	public void setCareerName(String careerName) {
		this.careerName = careerName;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("careerId", careerId);
			obj.put("careerName", careerName);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
