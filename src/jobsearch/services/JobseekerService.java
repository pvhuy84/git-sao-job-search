/**
 * 
 */
package jobsearch.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import jobsearch.entity.Notification;

import jobsearch.model.bean.Jobseeker;
import jobsearch.model.bean.User;
import jobsearch.model.bo.JobseekerBO;
import jobsearch.model.bo.UserBO;

/**
 * @author pvhuy84
 *
 */

@Path("/")
public class JobseekerService {
	
	@POST
	@Path("/add")
	public String addUser(@FormParam("name") String name,
			@FormParam("age") int age) {

		return (new Notification("ok", "ok").toJSON().toString());

	}

	@POST
	@Path("/addjobseeker")
	public String addJobseeker(@FormParam("email") String email, @FormParam("password") String password, @FormParam("repassword") String repassword,
			@FormParam("fullname") String fullname, @FormParam("phonenumber") String phonenumber) {
		new UserBO().addUser(new User(email, password, 1));
		return (new JobseekerBO().addJobseeker(new Jobseeker(fullname, email, null, 0, 0, phonenumber)).toJSON().toString());
	}
	
//	@POST
//	@Path("/addjobseeker")
//	public String addJobseeker(@QueryParam("email") String email, @QueryParam("password") String password, @QueryParam("repassword") String repassword,
//			@QueryParam("fullname") String fullname, @QueryParam("phonenumber") String phonenumber) {
//		new UserBO().addUser(new User(email, password, 1));
//		return (new JobseekerBO().addJobseeker(new Jobseeker(fullname, email, null, 0, 0, phonenumber)).toJSON().toString());
//	}

}
