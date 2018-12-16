package com.justLearnIT.controller;

import com.justLearnIT.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/learning")
public class LearningController {

    private final LearningService learningService;

    public LearningController(@Autowired LearningService learningService) {
        this.learningService = learningService;
    }

    @GetMapping
    public ResponseEntity<?> getPage() {
        return new ResponseEntity(learningService.getCategories(), HttpStatus.OK);
    }

}
