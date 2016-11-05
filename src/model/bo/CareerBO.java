package model.bo;

import java.util.ArrayList;

import model.bean.Career;
import model.dao.CareerDAO;

public class CareerBO {
	
	CareerDAO careerDAO = new CareerDAO();
	
	public boolean addCareer(Career career) {
		return careerDAO.addCareer(career);
	}
	
	public ArrayList<Career> getListCareer() {
		return careerDAO.getListCareer();
	}

}
