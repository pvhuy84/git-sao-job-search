package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Recruiter {
	private Integer recruiterId;
	private String email;
	private String name;
	private String detail;
	private String address;
	private String provinceId;
	private String phonenumber;
	private String website;
	private int scale;

	public Recruiter() {
	}

	public Recruiter(Integer recruiterId, String email, String name, String detail, String address, String provinceId,
			String phonenumber, String website, int scale) {
		this.recruiterId = recruiterId;
		this.email = email;
		this.name = name;
		this.detail = detail;
		this.address = address;
		this.provinceId = provinceId;
		this.phonenumber = phonenumber;
		this.website = website;
		this.scale = scale;
	}

	public int getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(int recruiterId) {
		this.recruiterId = recruiterId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("recruiterId", recruiterId);
			obj.put("email", email);
			obj.put("name", name);
			obj.put("detail", detail);
			obj.put("address", address);
			obj.put("provinceId", provinceId);
			obj.put("phonenumber", phonenumber);
			obj.put("website", website);
			obj.put("scale", scale);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
