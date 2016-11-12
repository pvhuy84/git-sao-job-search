package jobsearch.model.bo;
import jobsearch.entity.Notification;
import jobsearch.model.bean.Jobseeker;
import jobsearch.model.dao.JobseekerDAO;

public class JobseekerBO {
	JobseekerDAO jobseekerDAO = new JobseekerDAO();
	public Notification addJobseeker(Jobseeker jobseeker){
		return jobseekerDAO.addJobseeker(jobseeker);
	}
}
