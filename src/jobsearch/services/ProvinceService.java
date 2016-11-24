/**
 * 
 */
package jobsearch.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import jobsearch.model.bean.Province;
import jobsearch.model.bean.User;
import jobsearch.model.dao.ProvinceDAO;

/**
 * @author pvhuy84
 *
 */
@Path("/province")
public class ProvinceService {
	@GET
	@Path("/getallprovice")
	@Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

	public Response getListUser() {
		ArrayList<Province> allProvince = new ArrayList<>();
		allProvince = (new ProvinceDAO().getAllProvince());
		JSONArray allProvinceJson = new JSONArray();
		for(int i=0;i<allProvince.size();i++) {
			allProvinceJson.put(allProvince.get(i).toJSON());
		}
		String result=allProvinceJson.toString();
		return Response.ok() //200
				.entity(result)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
	}

}
