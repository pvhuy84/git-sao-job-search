/**
 * 
 */
package jobsearch.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import jobsearch.model.bean.Jobseeker;
import jobsearch.model.bean.User;
import jobsearch.model.bo.JobseekerBO;
import jobsearch.model.bo.UserBO;

/**
 * @author pvhuy84
 *
 */

@Path("/")
public class RecruiterService {
	@POST
	@Path("/addrecruiter")
	public String addRecruiter(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("fullname") String fullname, @QueryParam("phonenumber") String phonenumber) {
		new UserBO().addUser(new User(email, password, 1));
		return (new JobseekerBO().addJobseeker(new Jobseeker(fullname, email, null, 0, 0, phonenumber)).toJSON().toString());
	}
}
