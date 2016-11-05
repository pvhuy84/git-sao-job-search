package controller;

import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

import model.bean.User;
import model.bo.UserBO;

@Path("/user")
public class UserServices {

	@GET
	@Path("/getlistuser")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListUser() {
		ArrayList<User> listUser = new ArrayList<>();
		listUser = (new UserBO().getListUser());
		JSONArray listUserJson = new JSONArray();
		listUserJson.put(listUser);
		return listUserJson.toString();
	}

	@POST
	@Path("/adduser")
	public String addUser(@QueryParam("username") String username, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		return (new UserBO().addUser(new User(username, password, usertypeInt)).toJSON().toString());

	}

	@PUT
	@Path("/edituser")
	public String editUser(@QueryParam("username") String username, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		return (new UserBO().editUser(new User(username, password, usertypeInt)).toJSON().toString());
	}

	@DELETE
	@Path("/deleteuser")
	public String deleteUser(@QueryParam("username") String username) {
		return (new UserBO().deleteUser(username).toJSON().toString());
	}

	@POST
	@Path("/checkuser")
	public String checkUser(@QueryParam("username") String username, @QueryParam("password") String password) {
		return (new UserBO().checkUser(username, password).toJSON().toString());
	}

}
