package jobsearch.model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class District {
    private String districtid;
    private String name;
    private String type;
    private String location;
    private String provinceid;

    public District() {
    }

    public District(String districtid, String name, String type, String location, String provinceid) {
        this.districtid = districtid;
        this.name = name;
        this.type = type;
        this.location = location;
        this.provinceid = provinceid;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
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

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }
    public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("districtid", districtid);
			obj.put("name", name);
			obj.put("type", type);
			obj.put("location", location);
			obj.put("provinceid", provinceid);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}    
}
