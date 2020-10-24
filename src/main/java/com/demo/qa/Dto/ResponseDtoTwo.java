package com.demo.qa.Dto;

import java.util.List;

public class ResponseDtoTwo {
	
	String answerText;
	Long userId;
	int numberOfLike;
	List<ResponseDtoThree> listOfComments;
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public int getNumberOfLike() {
		return numberOfLike;
	}
	public void setNumberOfLike(int numberOfLike) {
		this.numberOfLike = numberOfLike;
	}
	public List<ResponseDtoThree> getListOfComments() {
		return listOfComments;
	}
	public void setListOfComments(List<ResponseDtoThree> listOfComments) {
		this.listOfComments = listOfComments;
	}
	@Override
	public String toString() {
		return "ResponseDtoTwo [answerText=" + answerText + ", userId=" + userId + ", numberOfLike=" + numberOfLike
				+ ", listOfComments=" + listOfComments + "]";
	}
	
	
	
	

	
}
