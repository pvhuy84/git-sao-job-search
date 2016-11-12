package jobsearch.services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;

import jobsearch.model.bean.Career;
import jobsearch.model.bo.CareerBO;

@Path("/career")
public class CareerServices {
	@GET
	@Path("/getlistuser")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListCareer() {
		ArrayList<Career> listCareer = new ArrayList<>();
		listCareer = (new CareerBO().getListCareer());
		JSONArray listCareerJson = new JSONArray();
		listCareerJson.put(listCareer);
		return listCareerJson.toString();
	}
}
