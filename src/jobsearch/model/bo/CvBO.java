package jobsearch.model.bo;

import java.util.ArrayList;

import jobsearch.model.bean.Cv;
import jobsearch.model.dao.CvDAO;

public class CvBO {
	
	CvDAO cvDAO = new CvDAO();
	
	public boolean addCv(Cv cv) {
		return cvDAO.addCv(cv);
	}
	
	public ArrayList<Cv> getListCv() {
		return cvDAO.getListCv();
	}

}
