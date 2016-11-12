package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Ward{
    private String wardid;
    private String name;
    private String type;
    private String location;
    private String districtid;

    public Ward() {
    }
    public Ward(String wardid, String name, String type, String location, String districtid) {
        this.wardid = wardid;
        this.name = name;
        this.type = type;
        this.location = location;
        this.districtid = districtid;
    }
	public String getWardid() {
		return wardid;
	}
	public void setWardid(String wardid) {
		this.wardid = wardid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDistrictid() {
		return districtid;
	}
	public void setDistrictid(String districtid) {
		this.districtid = districtid;
	}
	public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("wardid", wardid);
			obj.put("name", name);
			obj.put("type", type);
			obj.put("location", location);
			obj.put("districtid", districtid);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
    
}
