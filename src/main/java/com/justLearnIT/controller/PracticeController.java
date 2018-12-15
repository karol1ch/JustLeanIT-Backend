package com.justLearnIT.controller;


import com.justLearnIT.service.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/practice")
public class PracticeController {

    private final PracticeService practiceService;

    public PracticeController(@Autowired PracticeService practiceService) {
        this.practiceService = practiceService;
    }

    @GetMapping
    public ResponseEntity<?> getPage() {
        return new ResponseEntity(practiceService.getCategories(), HttpStatus.OK);
    }
}
