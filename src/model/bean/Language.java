package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Language {
	private int langId;
	private int language;
	public Language() {
	}
	public Language(int langId, int language) {
		this.langId = langId;
		this.language = language;
	}
	public int getLangId() {
		return langId;
	}
	public void setLangId(int langId) {
		this.langId = langId;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("langId", langId);
			obj.put("language", language);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
