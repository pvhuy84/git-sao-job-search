package jobsearch.model.bean;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class Recruitment {
    private int recruimentId;
    private int recruiterId;
    private String position;
    private String content;
    private String requirement;
    private Date datestart;
    private Date dateend;
    private String provinceId;
    private String categoryId;

    public Recruitment() {
    }

    
	
	public Recruitment(int recruimentId, int recruiterId, String position, String content, String requirement,
			Date datestart, Date dateend, String provinceId, String categoryId) {
		super();
		this.recruimentId = recruimentId;
		this.recruiterId = recruiterId;
		this.position = position;
		this.content = content;
		this.requirement = requirement;
		this.datestart = datestart;
		this.dateend = dateend;
		this.provinceId = provinceId;
		this.categoryId = categoryId;
	}



	public int getRecruimentId() {
		return recruimentId;
	}


	public void setRecruimentId(int recruimentId) {
		this.recruimentId = recruimentId;
	}


	public int getRecruiterId() {
		return recruiterId;
	}


	public void setRecruiterId(int recruiterId) {
		this.recruiterId = recruiterId;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getRequirement() {
		return requirement;
	}


	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}


	public Date getDatestart() {
		return datestart;
	}


	public void setDatestart(Date datestart) {
		this.datestart = datestart;
	}


	public Date getDateend() {
		return dateend;
	}


	public void setDateend(Date dateend) {
		this.dateend = dateend;
	}


	public String getProvinceId() {
		return provinceId;
	}


	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("recruimentId", recruimentId);
			obj.put("recruiterId", recruiterId);
			obj.put("position", position);
			obj.put("content", content);
			obj.put("requirement", requirement);
			obj.put("datestart", datestart);
			obj.put("dateend", dateend);
			obj.put("provinceId", provinceId);
			obj.put("categoryId", categoryId);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}

    
}
