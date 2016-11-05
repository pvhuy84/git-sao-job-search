package model.bean;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class Recruitment {
    private int recruimentId;
    private int recruiterId;
    private String title;
    private int salaryId;
    private String joblevelId;
    private String content;
    private String requirement;
    private String categoryId;
    private Date datestart;
    private Date dateend;
    private String provinceId;
    private int status;

    public Recruitment() {
    }

	public Recruitment(int recruimentId, int recruiterId, String title, int salaryId, String joblevelId, String content,
			String requirement, String categoryId, Date datestart, Date dateend, String provinceId, int status) {
		super();
		this.recruimentId = recruimentId;
		this.recruiterId = recruiterId;
		this.title = title;
		this.salaryId = salaryId;
		this.joblevelId = joblevelId;
		this.content = content;
		this.requirement = requirement;
		this.categoryId = categoryId;
		this.datestart = datestart;
		this.dateend = dateend;
		this.provinceId = provinceId;
		this.status = status;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public String getJoblevelId() {
		return joblevelId;
	}

	public void setJoblevelId(String joblevelId) {
		this.joblevelId = joblevelId;
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

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("recruimentId", recruimentId);
			obj.put("recruiterId", recruiterId);
			obj.put("title", title);
			obj.put("salaryId", salaryId);
			obj.put("joblevelId", joblevelId);
			obj.put("content", content);
			obj.put("requirement", requirement);
			obj.put("categoryId", categoryId);
			obj.put("datestart", datestart);
			obj.put("dateend", dateend);
			obj.put("provinceId", provinceId);
			obj.put("status", status);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}

    
}
