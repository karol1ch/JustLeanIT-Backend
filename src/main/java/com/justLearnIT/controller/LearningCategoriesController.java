package com.justLearnIT.controller;

import com.justLearnIT.model.LearningCategory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/learning")
@CrossOrigin
@RestController
public class LearningCategoriesController {

    @GetMapping
    public ResponseEntity<?> getLearningCategories() {

        LearningCategory java = LearningCategory.builder()
                .name("java")
                .description("to jest java")
                .build();

        LearningCategory java1 = LearningCategory.builder()
                .name("java1")
                .description("to jest java1")
                .build();

        List<LearningCategory> list = Arrays.asList(java, java1);

        return new ResponseEntity(list, HttpStatus.OK);
    }

}
