package com.demo.qa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub_topic")
public class SubTopic implements Serializable {
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sub_topic_id")
	private Long subTopicId;
	
	@Column(name="sub_topic_name")
	private String subTopicName;
	
	@Column(name="sub_topic_data")
	private String subTopicData;

	public Long getSubTopicId() {
		return subTopicId;
	}

	public void setSubTopicId(Long subTopicId) {
		this.subTopicId = subTopicId;
	}

	public String getSubTopicName() {
		return subTopicName;
	}

	public void setSubTopicName(String subTopicName) {
		this.subTopicName = subTopicName;
	}

	public String getSubTopicData() {
		return subTopicData;
	}

	public void setSubTopicData(String subTopicData) {
		this.subTopicData = subTopicData;
	}

	@Override
	public String toString() {
		return "SubTopic [subTopicId=" + subTopicId + ", subTopicName=" + subTopicName + ", subTopicData="
				+ subTopicData + "]";
	}
	
	
	
	

}
