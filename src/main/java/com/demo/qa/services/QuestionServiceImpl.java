package com.demo.qa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.qa.Dto.ResponseDtoOne;
import com.demo.qa.Dto.ResponseDtoThree;
import com.demo.qa.Dto.ResponseDtoTwo;
import com.demo.qa.dao.AnswerDao;
import com.demo.qa.dao.AnswerLikeDao;
import com.demo.qa.dao.CommentDao;
import com.demo.qa.dao.CompanyDao;
import com.demo.qa.dao.QuestionDao;
import com.demo.qa.dao.QuestionLikeDao;
import com.demo.qa.dao.TagDao;
import com.demo.qa.entities.*;
import com.demo.qa.entities.Answer;
import com.demo.qa.entities.Answer_likes;
import com.demo.qa.entities.Comments;
import com.demo.qa.entities.Question;
import com.demo.qa.entities.Question_likes;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDao qsnDao;
	
	@Autowired
	AnswerDao ansDao;
	
	@Autowired
	AnswerLikeDao ansLikeDao;
	
	@Autowired
	CommentDao cmntDao;
	
	@Autowired
	QuestionLikeDao qsnLikeDao;
	
	
	@Autowired
	CompanyDao cmpnyDao;
	
	@Autowired
	TagDao tagDao;
	
	@Override
	public ResponseEntity<?> setQuestions(Question questionData) {
		
		Question qsn = qsnDao.save(questionData);
		return new ResponseEntity<>(qsn,HttpStatus.CREATED);
	}

	@Override
	public ResponseDtoOne getQuestionAnswerData(Long questionId) {
		// TODO Auto-generated method stub
		
		Question qsn = qsnDao.findByQuesionId(questionId);
		
		List<Answer> listAnswer = ansDao.findByQuestionId(questionId);
		
		ResponseDtoOne resOne = new ResponseDtoOne();
		
		resOne.setQuestionText(qsn.getQsnText());
		
		List<Question_likes> qsnList = qsnLikeDao.findByQuestionId(questionId);
		
		int question_like =0;
		if(qsnList != null )
			question_like = qsnList.size();
		
		resOne.setNumLikeQuestion(question_like);
		
		List<ResponseDtoTwo> resTwoList = new ArrayList<ResponseDtoTwo>();
		
		for(Answer ans : listAnswer)
		{
			ResponseDtoTwo resTwo = new ResponseDtoTwo();
			
			resTwo.setAnswerText(ans.getAnswerText());
			resTwo.setUserId(ans.getAnswerId());
			
			Long answerId = ans.getAnswerId();
			Long userId = ans.getUserId();
			
			List<Answer_likes> likeList = ansLikeDao.findByAnswerId(answerId); 
			
			int noLike =0;
			
			if(likeList !=null)
			 noLike = likeList.size();
			
			resTwo.setNumberOfLike(noLike);
			
			
			
			List<Comments> cmntList = cmntDao.findByAnswerid(answerId);
			
			List<ResponseDtoThree> resThreeList = new ArrayList<ResponseDtoThree>();
			
			for(Comments cmnt : cmntList)
			{
				ResponseDtoThree resThree = new ResponseDtoThree();
				resThree.setCommentText(cmnt.getCommentText());
				resThree.setCommentDate(cmnt.getCommentDate());
				resThree.setUserId(cmnt.getUserId());
				
				resTwo.setListOfComments(resThreeList);
				
			}
			resTwoList.add(resTwo);	
			
		}
		
		resOne.setListOfAnswers(resTwoList);
		
		List<Tags> tagList = tagDao.findByQuestionId(questionId);
		resOne.setTagList(tagList);
		
		return resOne;
		
	
	}
	
	

}
