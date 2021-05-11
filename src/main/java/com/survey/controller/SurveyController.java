package com.survey.controller;

import com.survey.dto.CustomUser;
import com.survey.dto.UserSurveyResponseDto;
import com.survey.model.Survey;
import com.survey.dto.SurveyDto;
import com.survey.model.UserSurveyResponse;
import com.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public Survey saveSurvey(@RequestBody SurveyDto survey) {
        return surveyService.save(survey);
    }

    @GetMapping()
    public List<Survey> getAll() {
        CustomUser user = (CustomUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return surveyService.getAll();
    }

    @PostMapping("/userResponse")
    public UserSurveyResponse saveUserSurveyResponse(@RequestBody UserSurveyResponseDto userSurveyResponseDto) {
        return surveyService.saveUserSurveyResponse(userSurveyResponseDto);
    }
}
