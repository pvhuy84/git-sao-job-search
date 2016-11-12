/**
 * 
 */
package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Cv {
	private int cvId;
	private int candidateId;
	private int phonenumber;
	private int age;
	private int gender;
	private String careerId;
	private String qualification;
	private String 	experience;
	public Cv(int cvId, int candidateId, int phonenumber, int age, int gender, String careerId, String qualification,
			String experience) {
		super();
		this.cvId = cvId;
		this.candidateId = candidateId;
		this.phonenumber = phonenumber;
		this.age = age;
		this.gender = gender;
		this.careerId = careerId;
		this.qualification = qualification;
		this.experience = experience;
	}
	public int getCvId() {
		return cvId;
	}
	public void setCvId(int cvId) {
		this.cvId = cvId;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getCareerId() {
		return careerId;
	}
	public void setCareerId(String careerId) {
		this.careerId = careerId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("cvId", cvId);
			obj.put("candidateId", candidateId);
			obj.put("phonenumber", phonenumber);
			obj.put("age", age);
			obj.put("gender", gender);
			obj.put("candidateId", candidateId);
			obj.put("qualification", qualification);
			obj.put("experience", experience);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
