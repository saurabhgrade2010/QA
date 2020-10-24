package com.demo.qa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="question_id")
	private long questionId;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name="question_text")
	private String qsnText;
	
	@Column(name="company_id")
	private Long comapnyId;
	
	@OneToMany(mappedBy="quetsion")
	private List<Topic> topicList;
	
	@OneToMany(mappedBy="question")
	private List<Tags> tagList;
	
	@ManyToMany(mappedBy="question")
	private List<Company> companyList;
	
	@OneToMany(mappedBy="question")
	private SubTopic subTopic;
	
	
	
	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

	@OneToMany()
	
	
	
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

	public Long getComapnyId() {
		return comapnyId;
	}

	public void setComapnyId(Long comapnyId) {
		this.comapnyId = comapnyId;
	}

	@Column(name="sub_topic_id",nullable=false)
	private Long subTopicId;
	
	@Column(name="tags")
	private List<Long> listTags;
	
	@Column(name="user_id")
	private long userId;

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQsnText() {
		return qsnText;
	}

	public void setQsnText(String qsnText) {
		this.qsnText = qsnText;
	}

	public Long getSubTopicId() {
		return subTopicId;
	}

	public void setSubTopicId(Long subTopicId) {
		this.subTopicId = subTopicId;
	}

	public List<Long> getListTags() {
		return listTags;
	}

	public void setListTags(List<Long> listTags) {
		this.listTags = listTags;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", qsnText=" + qsnText + ", comapnyId=" + comapnyId
				+ ", topicList=" + topicList + ", tagList=" + tagList + ", companyList=" + companyList + ", subTopicId="
				+ subTopicId + ", listTags=" + listTags + ", userId=" + userId + "]";
	}

	
	
	
	
	
	
	
	

}
