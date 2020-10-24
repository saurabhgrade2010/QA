package com.demo.qa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="topic")
public class Topic implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="topic_id")
	private Long topicId;
	
	@ManyToOne
	@JoinColumn(name="question_id",nullable=false)
	private Question question;
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name="topic_name")
	private String topicName;
	
	@Column(name="sub_topic_id")
	private Long subTopicId;

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Long getSubTopicId() {
		return subTopicId;
	}

	public void setSubTopicId(Long subTopicId) {
		this.subTopicId = subTopicId;
	}

	@Override
	public String toString() {
		return "Topic [topicId=" + topicId + ", question=" + question + ", topicName=" + topicName + ", subTopicId="
				+ subTopicId + "]";
	}
	
	
	
	
	
}
