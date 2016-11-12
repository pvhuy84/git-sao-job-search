package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Jobseekerlang {
    private int cvId;
    private int langLevelId;
    public Jobseekerlang() {
    }
    
	public int getCvId() {
		return cvId;
	}

	public void setCvId(int cvId) {
		this.cvId = cvId;
	}

	public int getLangLevelId() {
		return langLevelId;
	}

	public void setLangLevelId(int langLevelId) {
		this.langLevelId = langLevelId;
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("cvId", cvId);
			obj.put("langLevelId", langLevelId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
