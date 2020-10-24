package com.demo.qa.Dto;

import java.util.Date;

public class ResponseDtoThree {
	
	private String commentText;
	private Date commentDate;
	private Long userId;
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ResponseDtoThree [commentText=" + commentText + ", commentDate=" + commentDate + ", userId=" + userId
				+ "]";
	}
	
	

}
