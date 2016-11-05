package model.bean;

public class Career {
	private String careerId;
	private String careerName;
	public Career(String careerId, String careerName) {
		super();
		this.careerId = careerId;
		this.careerName = careerName;
	}
	public String getCareerId() {
		return careerId;
	}
	public void setCareerId(String careerId) {
		this.careerId = careerId;
	}
	public String getCareerName() {
		return careerName;
	}
	public void setCareerName(String careerName) {
		this.careerName = careerName;
	}
	
	
}
