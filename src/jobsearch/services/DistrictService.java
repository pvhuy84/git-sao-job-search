/**
 * 
 */
package jobsearch.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import jobsearch.model.bean.District;
import jobsearch.model.dao.DistrictDAO;

/**
 * @author pvhuy84
 *
 */
@Path("/district")
public class DistrictService {
	@GET
	@Path("/getlistdistrict")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

	public Response getListUser(@QueryParam("provinceid") String provinceid) {
		ArrayList<District> listDistrict = new ArrayList<>();
		listDistrict = (new DistrictDAO().getListDistrict(provinceid));
		JSONArray listDistrictJson = new JSONArray();
		for(int i=0;i<listDistrict.size();i++) {
			listDistrictJson.put(listDistrict.get(i).toJSON());
		}
		String result=listDistrictJson.toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}
}
