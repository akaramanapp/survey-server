package com.survey.service;

import com.survey.dto.OptionDto;
import com.survey.model.Option;
import com.survey.model.QuestionOptions;
import com.survey.repository.OptionsRepository;
import com.survey.repository.QuestionOptionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "optionsService")
public class OptionsService {
    @Autowired
    private OptionsRepository optionsRepository;

    @Autowired
    private QuestionOptionsRepository questionOptionsRepository;

    public Option saveOption(OptionDto option) {
        Option newOption = new Option();
        newOption.setOption_title(option.getOption_title());
        Option result = optionsRepository.save(newOption);

        if(result != null) {
            QuestionOptions questionOptions = new QuestionOptions();
            questionOptions.setOption_id(result.getId());
            questionOptions.setQuestion_id(option.getQuestion_id());
            questionOptionsRepository.save(questionOptions);
        }
        return result;
    }
}
