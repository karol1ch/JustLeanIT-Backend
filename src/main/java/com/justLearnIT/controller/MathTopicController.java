package com.justLearnIT.controller;

import com.justLearnIT.service.MathTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/math/{mathCategory}/{mathTopicID}")
public class MathTopicController {

    private final MathTopicService mathTopicService;

    public MathTopicController(@Autowired MathTopicService mathTopicService){
        this.mathTopicService = mathTopicService;
    }

    @GetMapping
    public ResponseEntity<?> getMathTopic(@PathVariable("mathTopicID") int mathTopicId){
        mathTopicService.getTopicById(mathTopicId);
        return new ResponseEntity(mathTopicService.getTopicById(mathTopicId), HttpStatus.OK);
    }
}
