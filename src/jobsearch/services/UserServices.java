package jobsearch.services;

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

import jobsearch.entity.Notification;
import jobsearch.model.bean.User;
import jobsearch.model.bo.UserBO;

@Path("/")
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
	public String addUser(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		return (new UserBO().addUser(new User(email, password, usertypeInt)).toJSON().toString());

	}

	@PUT
	@Path("/edituser")
	public String editUser(@QueryParam("email") String email, @QueryParam("password") String password,
			@QueryParam("usertype") String usertype) {
		int usertypeInt = Integer.parseInt(usertype);
		return (new UserBO().editUser(new User(email, password, usertypeInt)).toJSON().toString());
	}

	@DELETE
	@Path("/deleteuser")
	public String deleteUser(@QueryParam("email") String email) {
		return (new UserBO().deleteUser(email).toJSON().toString());
	}

	@POST
	@Path("/checkuser")
	public String checkUser(@QueryParam("email") String email, @QueryParam("password") String password) {
		return (new UserBO().checkUser(email, password).toJSON().toString());
	}

}
