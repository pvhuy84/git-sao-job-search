package jobsearch.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import jobsearch.entity.Notification;
import jobsearch.model.bean.Recruiter;
import jobsearch.model.bean.User;
import jobsearch.model.dao.UserDAO;

@Path("/user")
public class UserServices {

	// Dang ky cho jobseeker(done)
	@POST
	@Path("/adduserjobseeker")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUserJobseeker(@FormParam("email") String email, @FormParam("password") String password,
			@FormParam("fullname") String fullname, @FormParam("phonenumber") String phonenumber) {
		String result = new UserDAO().addUserJobseeker(email, password, fullname, phonenumber).toJSON().toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	// Dang ky cho recruiter(done)
	@POST
	@Path("/adduserrecruiter")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUserRecruiter(@FormParam("email") String email, @FormParam("password") String password, @FormParam("name") String name,
			@FormParam("detail") String detail, @FormParam("address") String address,
			@FormParam("provinceId") String provinceId, @FormParam("phonenumber") String phonenumber,
			@FormParam("website") String website, @FormParam("scale") String scale) {
		int scaleInt = Integer.parseInt(scale);
		String result = new UserDAO().addUserRecruiter(new Recruiter(null ,email, name, detail, address, provinceId, phonenumber, website, scaleInt), password).toJSON().toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	// Dang nhap (done)
	@POST
	@Path("/checkuser")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkUser(@FormParam("email") String email, @FormParam("password") String password) {
		Notification notification = new UserDAO().checkUser(email, password);
		String result="";
		if(notification.getMesseage().equals("you is jobseeker")) {
			result=new UserDAO().getUserJobseeker(email).toJSON().toString();
		} else if(notification.getMesseage().equals("you is recruiter")) {
			result=new UserDAO().getUserRecruiter(email).toJSON().toString();
		} else {
			result=notification.toJSON().toString();
		}
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	/*
	 * 
	 */

	@GET
	@Path("/getlistuser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response getListUser() {
		ArrayList<User> listUser = new ArrayList<>();
		listUser = (new UserDAO().getListUser());
		JSONArray listUserJson = new JSONArray();
		for (int i = 0; i < listUser.size(); i++) {
			listUserJson.put(listUser.get(i).toJSON());
		}
		String result = listUserJson.toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	@PUT
	@Path("/edituser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response editUser(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		String result = new UserDAO().editUser(new User(email, password, usertypeInt)).toJSON().toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	@DELETE
	@Path("/deleteuser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUser(@QueryParam("email") String email) {
		String result = new UserDAO().deleteUser(email).toJSON().toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

}
