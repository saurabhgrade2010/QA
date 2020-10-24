package com.demo.qa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="answer_id")
	private long answerId;

	@Column(name="question_id")
	private long questionId;
	
	@Column(name="answer_text")
	private String answerText;
	
	@Column(name="user_id")
	private long userId;
	
	@OneToMany(mappedBy="answer")
	private List<Comments> comment;
	
	
	

	public List<Comments> getComment() {
		return comment;
	}



	public void setComment(List<Comments> comment) {
		this.comment = comment;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public long getQuestionId() {
		return questionId;
	}
	
	

	public long getAnswerId() {
		return answerId;
	}



	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}



	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", questionId=" + questionId + ", answerText=" + answerText
				+ ", userId=" + userId + ", comment=" + comment + "]";
	}
	
	
	
}
