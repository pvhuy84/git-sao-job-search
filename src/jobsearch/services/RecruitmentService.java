/**
 * 
 */
package jobsearch.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import jobsearch.model.dao.RecruitmentDAO;

/**
 * @author pvhuy84
 *
 */
@Path("/recruitment")
public class RecruitmentService {
	//Dang tin tuyen dung (doing)
	@POST
	@Path("/postrecruitment")
	@Produces(MediaType.APPLICATION_JSON)
	public Response postRecruitment(@FormParam("email") String email, @FormParam("password") String password,
			@FormParam("fullname") String fullname, @FormParam("phonenumber") String phonenumber) {
		String result=new RecruitmentDAO().postRecruitment().toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}
}
