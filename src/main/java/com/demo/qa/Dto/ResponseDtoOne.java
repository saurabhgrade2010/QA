package com.demo.qa.Dto;

import java.util.List;

import com.demo.qa.entities.Company;
import com.demo.qa.entities.Tags;
import com.demo.qa.entities.Topic;

public class ResponseDtoOne {
	
	
	private String questionText;
	
	List<ResponseDtoTwo> listOfAnswers;
	
	int numLikeQuestion;
	List<Company> listCompany;
	List<Tags> tagList;
	List<Topic> topicList;
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public List<ResponseDtoTwo> getListOfAnswers() {
		return listOfAnswers;
	}
	public void setListOfAnswers(List<ResponseDtoTwo> listOfAnswers) {
		this.listOfAnswers = listOfAnswers;
	}
	public int getNumLikeQuestion() {
		return numLikeQuestion;
	}
	public void setNumLikeQuestion(int numLikeQuestion) {
		this.numLikeQuestion = numLikeQuestion;
	}
	public List<Company> getListCompany() {
		return listCompany;
	}
	public void setListCompany(List<Company> listCompany) {
		this.listCompany = listCompany;
	}
	public List<Tags> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tags> tagList) {
		this.tagList = tagList;
	}
	public List<Topic> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	@Override
	public String toString() {
		return "ResponseDtoOne [questionText=" + questionText + ", listOfAnswers=" + listOfAnswers
				+ ", numLikeQuestion=" + numLikeQuestion + ", listCompany=" + listCompany + ", tagList=" + tagList
				+ ", topicList=" + topicList + "]";
	}
	
	

}
