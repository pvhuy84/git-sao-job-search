package model.bean;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

public class Feedback {
    private int feedbackId;
    private String content;
    private Date date;
    private int jobseekerId;

    public Feedback() {
    }

    public Feedback(int feedbackId, String content, Date date, int jobseekerId) {
		this.feedbackId = feedbackId;
		this.content = content;
		this.date = date;
		this.jobseekerId = jobseekerId;
	}

	public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getJobseekerId() {
        return jobseekerId;
    }

    public void setJobseekerId(int jobseekerId) {
        this.jobseekerId = jobseekerId;
    }
    public JSONObject toJSON() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("feedbackId", feedbackId);
			obj.put("jobseekerId", jobseekerId);
			obj.put("content", content);
			obj.put("date", date);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
}
