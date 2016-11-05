package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Joblevel  {
    private String joblevelId;
    private String joblevel;

    public Joblevel() {
    }


    public Joblevel(String joblevelId, String joblevel) {
        this.joblevelId = joblevelId;
        this.joblevel = joblevel;
    }

    public String getJoblevelId() {
        return joblevelId;
    }

    public void setJoblevelId(String joblevelId) {
        this.joblevelId = joblevelId;
    }

    public String getJoblevel() {
        return joblevel;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel;
    }

    public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("joblevelId", joblevelId);
			obj.put("joblevel", joblevel);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}    
}
