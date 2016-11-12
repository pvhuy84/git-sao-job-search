package jobsearch.entity;

import org.json.JSONException;
import org.json.JSONObject;

public class Notification {
	private String state;
	private String messeage;
	public Notification(String state, String messeage) {
		super();
		this.state = state;
		this.messeage = messeage;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMesseage() {
		return messeage;
	}
	public void setMesseage(String messeage) {
		this.messeage = messeage;
	}
	
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("state", this.state);
			obj.put("message", this.messeage);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}
