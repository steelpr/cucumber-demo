package projections.project.model;

import java.util.Date;

import projections.projection.service.ProjectionService;

public class ProjectionScreenModel {
	private String title;
	private String content;
	private Date date;
	private String message;
	private int seat;

	public void setTitle(final String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public void setDateTime(Date date) {
		this.date = date;
	}
	
	public void clickCreatePostButton() {
		message= ProjectionService.createProjection(title, content, date);

	}	
	
	public String getMessage() {
		return message;
	}
}
