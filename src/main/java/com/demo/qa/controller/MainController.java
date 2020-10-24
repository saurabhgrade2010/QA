package com.demo.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.qa.dao.TopicDao;
import com.demo.qa.entities.Answer;
import com.demo.qa.entities.Answer_likes;
import com.demo.qa.entities.Comments;
import com.demo.qa.entities.Company;
import com.demo.qa.entities.Question;
import com.demo.qa.entities.Question_likes;
import com.demo.qa.entities.SubTopic;
import com.demo.qa.entities.Tags;
import com.demo.qa.entities.Topic;
import com.demo.qa.entities.Userr;
import com.demo.qa.services.AnswerLikeService;
import com.demo.qa.services.AnswerService;
import com.demo.qa.services.CommentService;
import com.demo.qa.services.CompanyService;
import com.demo.qa.services.QuestionLike;
import com.demo.qa.services.QuestionService;
import com.demo.qa.services.SubTopicServic;
import com.demo.qa.services.TagService;
import com.demo.qa.services.TopicService;
import com.demo.qa.services.UserService;

@RestController
@RequestMapping("qa")
public class MainController {

	@Autowired
	UserService userService;
	
	@Autowired
	QuestionService questionService;
	
	@Autowired
	AnswerService answerServcie;
	
	
	@Autowired
	CommentService commentService;
	
	@Autowired
	QuestionLike qsnLikeService;
	
	@Autowired
	AnswerLikeService ansLikeService;
	
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	SubTopicServic subTopicServcie;
	
	@Autowired
	TagService tagService;
	
	
	@Autowired
	TopicService topicService;
	
	@PostMapping("/user/save")
	public ResponseEntity<?>  saveUser(Userr user)
	{
		return userService.setUserData(user);
	}
	
	
	@PostMapping("/save/question")
	public ResponseEntity<?> saveQuestion(Question question)
	{
		return questionService.setQuestions(question);
	}
	
	
	
	@PostMapping("/save/answer")
	public ResponseEntity<?> saveAnaswre(Answer answer)
	{
		return answerServcie.saveAnswer(answer);
	}
	
	@PostMapping("save/comment")
	public ResponseEntity<?> saveComments(Comments commentData)
	{
		return commentService.saveComments(commentData);
	}
	
	
	@PostMapping("save/question/like")
	public ResponseEntity<?> saveQuestionLike(Question_likes qsnLikeData)
	{
		return qsnLikeService.saveQuestionLike(qsnLikeData);
	}
	
	@PostMapping("save/answer/like")
	public ResponseEntity<?> saveAnswerLike(Answer_likes answerData)
	{
		return ansLikeService.saveAnswerLikeData(answerData);
	}
	
	
	
	
	/*  ********************************** COMPANY START *******************************************  */
	
	
	
	@PostMapping("/company/save")
	public ResponseEntity<?> saveCompanyData(@RequestBody Company company)
	{
		return companyService.savecompanyData(company);
	}
	
	
	@DeleteMapping("company/del/{companyId}")
	public ResponseEntity<?> deleteCompanyData(@PathVariable("companyId") Long companyId)
	{
	   return companyService.deleteCopmany(companyId);
	}
	
	
	@PutMapping("/company/update")
	public ResponseEntity<?> updateCompanyData(@RequestBody Company company)
	{
		return companyService.updateCompany(company);
	}
	
	
	/*  ********************************** COMPANY END *******************************************  */
	
	
	
	/* *********************************** TOPIC START******************************************* */
	
	
	
	@PostMapping("/topic/save")
	public ResponseEntity<?> saveTopicData(@RequestBody Topic topic)
	{
		return topicService.saveTopicData(topic);
	}
	
	
	@DeleteMapping("/topic/del/{topicId}")
	public ResponseEntity<?> deleteTopicData(@PathVariable("topicId") Long topicId)
	{
		return topicService.deleteTopicData(topicId);
	}
	
	@PutMapping("/topic/update")
	public ResponseEntity<?> updateTopicData(@RequestBody Topic topicData)
	{
		return topicService.updateTopicData(topicData);
	}
	
	/* *********************************** TOPIC END******************************************* */
	
	
	
	
	
	/* ***********************************SUB  TOPIC END******************************************* */
	
	
	
	@PostMapping("/subtopic/save")
	public ResponseEntity<?> saveSubTopicData(@RequestBody SubTopic subTopicData)
	{
		return subTopicServcie.saveSubTopicData(subTopicData);
	}
	
	
	
	@DeleteMapping("/subtopic/del/{subTopicId}")
	public ResponseEntity<?> deleteSubTopicData(@PathVariable("subTopicId") Long subTopicId )
	{
		return subTopicServcie.deleteSubTopic(subTopicId);
	}
	
	
	@PutMapping("/subtopic/update")
	public ResponseEntity<?> updateSubTopicEntity(@RequestBody SubTopic subTopicData)
	{
		return subTopicServcie.updateSubTopic(subTopicData);
	}

	
	
	
	
	
	/* ***********************************SUB TOPIC END******************************************* */
	
	
	
	
	
	/* *********************************** TAG START ******************************************* */
	
	
	@PostMapping("/tags/save")
	public ResponseEntity<?> saveTagData(@RequestBody Tags tagData)
	{
		return tagService.saveTagData(tagData);
	}
	
	
	
	@DeleteMapping("/tags/del/{tagId}")
	public ResponseEntity<?> deleteTagData(@PathVariable("tagId") Long tagId )
	{
		return tagService.deleteTagData(tagId);
	}
	
	
	
	@PutMapping("/tags/update")
	public ResponseEntity<?> updateTagData(@RequestBody Tags tagData)
	{
		return tagService.updateTagData(tagData);
	}
	
	/* *********************************** TAG END ******************************************* */




}
