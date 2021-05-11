package com.survey.service;

import com.survey.dto.QuestionDto;
import com.survey.model.Question;
import com.survey.model.SurveyQuestion;
import com.survey.repository.QuestionRepository;
import com.survey.repository.SurveyQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "questionService")
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private SurveyQuestionRepository surveyQuestionRepository;

    public Question saveQuestion(QuestionDto questionDto) {
        Question question = new Question();
        question.setQuestion_title(questionDto.getQuestion_title());
        Question result = questionRepository.save(question);

        if(result != null) {
            SurveyQuestion surveyQuestion = new SurveyQuestion();
            surveyQuestion.setQuestion_id(result.getId());
            surveyQuestion.setSurvey_id(questionDto.getSurvey_id());
            SurveyQuestion res = surveyQuestionRepository.save(surveyQuestion);
        }

        return result;
    }
}
