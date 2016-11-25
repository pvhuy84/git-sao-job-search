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

import jobsearch.model.bean.User;
import jobsearch.model.dao.UserDAO;

@Path("/user")
public class UserServices {
	
	//Dang ky (done)
	@POST
	@Path("/adduserjobseeker")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUserJobseeker(@FormParam("email") String email, @FormParam("password") String password,
			@FormParam("fullname") String fullname, @FormParam("phonenumber") String phonenumber) {
		String result=new UserDAO().addUserJobseeker(email, password, fullname, phonenumber).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}
	
	//Dang nhap (done)
	@POST
	@Path("/checkuser")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkUser(@FormParam("email") String email, @FormParam("password") String password) {
		String result=new UserDAO().checkUser(email, password).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
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
		for(int i=0;i<listUser.size();i++) {
			listUserJson.put(listUser.get(i).toJSON());
		}
		String result=listUserJson.toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	

	@PUT
	@Path("/edituser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response editUser(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		String result=new UserDAO().editUser(new User(email, password, usertypeInt)).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	@DELETE
	@Path("/deleteuser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUser(@QueryParam("email") String email) {
		String result=new UserDAO().deleteUser(email).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	
	

}
