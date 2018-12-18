package com.justLearnIT.controller;

import com.justLearnIT.service.LearningTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/learning/{category}/{topicID}")
public class LearningTopicController {

    private final LearningTopicService learningTopicService;

    public LearningTopicController(@Autowired LearningTopicService learningTopicService) {
        this.learningTopicService = learningTopicService;
    }

    @GetMapping
    public ResponseEntity<?> getTopic(@PathVariable("topicID") int topicID) {
        return new ResponseEntity(learningTopicService.getTopicById(topicID), HttpStatus.OK);
    }

}
