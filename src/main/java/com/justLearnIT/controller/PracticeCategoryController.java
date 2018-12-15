package com.justLearnIT.controller;

import com.justLearnIT.service.PracticeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/practice/{category}")
public class PracticeCategoryController {

    private final PracticeCategoryService practiceCategoryService;

    public PracticeCategoryController(@Autowired PracticeCategoryService practiceCategoryService) {
        this.practiceCategoryService = practiceCategoryService;
    }

    @GetMapping("/problems")
    public ResponseEntity<?> getTopics(@PathVariable("category") String category) {
        return new ResponseEntity(practiceCategoryService.getProblemsByCategoryName(category), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<?> getCategory(@PathVariable("category") String category) {
        return new ResponseEntity(practiceCategoryService.getCategoryByCategoryName(category), HttpStatus.OK);
    }

}
