package model.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class Category {
    private String categoryId;
    private String category;

    public Category() {
    }

    public Category(String categoryId, String category) {
        this.categoryId = categoryId;
        this.category = category;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("categoryId", categoryId);
			obj.put("category", category);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
