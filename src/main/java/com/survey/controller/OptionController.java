package com.survey.controller;

import com.survey.dto.OptionDto;
import com.survey.model.Option;
import com.survey.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/option")
public class OptionController {
    @Autowired
    private OptionsService optionsService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Option saveOption(@RequestBody OptionDto option) {
        return optionsService.saveOption(option);
    }
}
