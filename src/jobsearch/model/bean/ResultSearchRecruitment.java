package jobsearch.model.bean;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class ResultSearchRecruitment {
	private int recruimentId;
	private int recruiterId;
	private String recruiterName;
	private String position;
	private String content;
	private String requirement;
	private Date datestart;
	private Date dateend;
	private String provinceName;

	public ResultSearchRecruitment() {
	}

	public ResultSearchRecruitment(int recruimentId, int recruiterId, String recruiterName, String position,
			String content, String requirement, Date datestart, Date dateend, String provinceName) {
		super();
		this.recruimentId = recruimentId;
		this.recruiterId = recruiterId;
		this.recruiterName = recruiterName;
		this.position = position;
		this.content = content;
		this.requirement = requirement;
		this.datestart = datestart;
		this.dateend = dateend;
		this.provinceName = provinceName;
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

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
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

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("recruimentId", recruimentId);
			obj.put("recruiterId", recruiterId);
			obj.put("recruiterName", recruiterName);
			obj.put("position", position);
			obj.put("content", content);
			obj.put("requirement", requirement);
			obj.put("datestart", datestart);
			obj.put("dateend", dateend);
			obj.put("provinceName", provinceName);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}	

}
