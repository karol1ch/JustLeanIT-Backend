package com.justLearnIT.controller;

import com.justLearnIT.service.SubmitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/submits")
public class SubmitsController {
    private final SubmitsService submitsService;

    public SubmitsController(@Autowired SubmitsService submitsService) {
        this.submitsService = submitsService;
    }

    @GetMapping
    public ResponseEntity<?> getPage() {
        return new ResponseEntity(submitsService.getSubmits(), HttpStatus.OK);
    }
}
