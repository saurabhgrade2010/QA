package com.demo.qa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question_likes")
public class Question_likes implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question_like_id")
	private long questionLikeId;
	
	@Column(name="question_id")
	private long questionId;
	
	@Column(name="user_id")
	private long userId;
	
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getQuestionLikeId() {
		return questionLikeId;
	}

	public void setQuestionLikeId(long questionLikeId) {
		this.questionLikeId = questionLikeId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Question_likes [questionLikeId=" + questionLikeId + ", questionId=" + questionId + ", userId=" + userId
				+ "]";
	}

	
	
	

}
