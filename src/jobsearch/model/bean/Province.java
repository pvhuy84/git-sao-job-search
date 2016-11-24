package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Province {
	private String provinceId;
	private String provinceName;
	private String type;
	public Province() {
	}
	public Province(String provinceId, String provinceName, String type) {
		this.provinceId = provinceId;
		this.provinceName = provinceName;
		this.type = type;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("provinceId", provinceId);
			obj.put("provinceName", provinceName);
			obj.put("type", type);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
