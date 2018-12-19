package com.justLearnIT.controller;

import com.justLearnIT.model.PaginatedResponse;
import com.justLearnIT.model.Topic;
import com.justLearnIT.service.LearningCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/learning/{category}")
public class LearningCategoryController {

    private final LearningCategoryService learningCategoryService;

    public LearningCategoryController(@Autowired LearningCategoryService learningCategoryService) {
        this.learningCategoryService = learningCategoryService;
    }

    @GetMapping("/topics")
    public ResponseEntity<?> getTopics(@PathVariable("category") String category) {
        return new ResponseEntity(learningCategoryService.getTopicsByCategoryName(category), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<?> getCategory(@PathVariable("category") String category) {
        return new ResponseEntity(learningCategoryService.getCategoryByCategoryName(category), HttpStatus.OK);
    }

    @GetMapping("/category/page={pageNumber}")
    public ResponseEntity<?> getCategoryPage(@PathVariable("category") String category, @PathVariable("pageNumber") int pageNumber) {
        PaginatedResponse<Topic> response = new PaginatedResponse<>(learningCategoryService.getTopicsByCategoryName(category), pageNumber);
        return new ResponseEntity(response, HttpStatus.OK);
    }

}
