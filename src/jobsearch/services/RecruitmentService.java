/**
 * 
 */
package jobsearch.services;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;

import jobsearch.model.bean.ResultSearchRecruitment;
import jobsearch.model.dao.RecruitmentDAO;

/**
 * @author pvhuy84
 *
 */
@Path("/recruitment")
public class RecruitmentService {
	// Dang tin tuyen dung (doing)
	@POST
	@Path("/postrecruitment")
	@Produces(MediaType.APPLICATION_JSON)
	public Response postRecruitment(@FormParam("recruiterId") String recruiterId,
			@FormParam("position") String position, @FormParam("requirement") String requirement,
			@FormParam("content") String content, @FormParam("dateend") String dateend,
			@FormParam("provinceid") String provinceid, @FormParam("categoryid") String categoryid) {
		int recruiterIdInt = Integer.parseInt(recruiterId);
		String result = new RecruitmentDAO()
				.postRecruitment(recruiterIdInt, position, content, requirement, dateend, provinceid, categoryid).toJSON()
				.toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}

	@POST
	@Path("/searchrecruitment")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchRecruitment(@FormParam("option") String option, @FormParam("categoryid") String categoryid,
			@FormParam("provinceid") String provinceid) {
		ArrayList<ResultSearchRecruitment> resultSearch = new ArrayList<>();
		resultSearch = new RecruitmentDAO().searchRecruitment(option, categoryid, provinceid);
		JSONArray resultSearchJson = new JSONArray();
		for (int i = 0; i < resultSearch.size(); i++) {
			resultSearchJson.put(resultSearch.get(i).toJSON());
		}
		String result = resultSearchJson.toString();
		return Response.ok() // 200
				.entity(result).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
	}
}
