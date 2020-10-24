package com.demo.qa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answer_likes")
public class Answer_likes implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="answer_like_id")
	private long answerLikeId;
	
	@Column(name="answer_id")
	private long answerId;
	
	@Column(name="user_id")
	private long userId;
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getAnswerLikeId() {
		return answerLikeId;
	}

	public void setAnswerLikeId(long answerLikeId) {
		this.answerLikeId = answerLikeId;
	}

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Answer_likes [answerLikeId=" + answerLikeId + ", answerId=" + answerId + ", userId=" + userId + "]";
	}
	
	

}
