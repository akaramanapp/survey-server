package com.survey.controller;

import com.survey.dto.QuestionDto;
import com.survey.model.Question;
import com.survey.repository.QuestionRepository;
import com.survey.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public Question saveQuestion(@RequestBody QuestionDto questionDto) {
        return questionService.saveQuestion(questionDto);
    }
}
