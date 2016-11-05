package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Langlevel {
	private int langLevelId;
	private int langId;
	private String level;

	public Langlevel() {
	}

	public Langlevel(int langLevelId, int langId, String level) {
		this.langLevelId = langLevelId;
		this.langId = langId;
		this.level = level;
	}

	public int getLangLevelId() {
		return langLevelId;
	}

	public void setLangLevelId(int langLevelId) {
		this.langLevelId = langLevelId;
	}

	public int getLangId() {
		return langId;
	}

	public void setLangId(int langId) {
		this.langId = langId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("langLevelId", langLevelId);
			obj.put("langId", langId);
			obj.put("level", level);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
