package com.justLearnIT.controller;

import com.justLearnIT.model.MathTopic;
import com.justLearnIT.model.PaginatedResponse;
import com.justLearnIT.service.MathCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/math/{mathCategory}")
public class MathCategoryController {

    private final MathCategoryService mathCategoryService;

    public MathCategoryController(@Autowired MathCategoryService mathCategoryService){
        this.mathCategoryService = mathCategoryService;
    }

    @GetMapping("/mathTopics")
    public ResponseEntity<?> getMathTopics(@PathVariable("mathCategory") String mathCategory){
        return new ResponseEntity(mathCategoryService.getTopicsByMathCategoryName(mathCategory), HttpStatus.OK);
    }

    @GetMapping("/mathCategory")
    public ResponseEntity<?> getMathCategory(@PathVariable("mathCategory") String mathCategory){
        System.out.println(mathCategoryService.getMathCategoryByMathCategoryName(mathCategory));
        return new ResponseEntity(mathCategoryService.getMathCategoryByMathCategoryName(mathCategory), HttpStatus.OK);
    }

    @GetMapping("/mathCategory/page={pageNumber}")
    public ResponseEntity<?> getMathCategoryPage(@PathVariable("mathCategory") String mathCategory, @PathVariable("pageNumber") int pageNumber){
        PaginatedResponse<MathTopic> response = new PaginatedResponse<>(mathCategoryService.getTopicsByMathCategoryName(mathCategory), pageNumber);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
