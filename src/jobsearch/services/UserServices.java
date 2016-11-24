package jobsearch.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
import jobsearch.model.bean.User;
import jobsearch.model.bo.UserBO;

@Path("/")
public class UserServices {

	@GET
	@Path("/getlistuser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
//	public String getListUser() {
//		ArrayList<User> listUser = new ArrayList<>();
//		listUser = (new UserBO().getListUser());
//		JSONArray listUserJson = new JSONArray();
//		listUserJson.put(listUser);
//		return listUserJson.toString();
//	}
	public Response getListUser() {
		ArrayList<User> listUser = new ArrayList<>();
		listUser = (new UserBO().getListUser());
		JSONArray listUserJson = new JSONArray();
		listUserJson.put(listUser);
		String result=listUserJson.toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

	@POST
	@Path("/adduser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		String result=new UserBO().addUser(new User(email, password, usertypeInt)).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

	@PUT
	@Path("/edituser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response editUser(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		String result=new UserBO().editUser(new User(email, password, usertypeInt)).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

	@DELETE
	@Path("/deleteuser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUser(@QueryParam("email") String email) {
		String result=new UserBO().deleteUser(email).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

	@POST
	@Path("/checkuser")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response checkUser(@QueryParam("email") String email, @QueryParam("password") String password) {
		String result=new UserBO().checkUser(email, password).toJSON().toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

}
