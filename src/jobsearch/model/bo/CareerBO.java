package jobsearch.model.bo;

import java.util.ArrayList;

import jobsearch.model.bean.Career;
import jobsearch.model.dao.CareerDAO;

public class CareerBO {
	
	CareerDAO careerDAO = new CareerDAO();
	
	public boolean addCareer(Career career) {
		return careerDAO.addCareer(career);
	}
	
	public ArrayList<Career> getListCareer() {
		return careerDAO.getListCareer();
	}

}
