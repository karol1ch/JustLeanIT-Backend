package com.justLearnIT.controller;

import com.justLearnIT.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/math")
public class MathController {

    private final MathService mathService;

    public MathController(@Autowired MathService mathService){
        this.mathService = mathService;
    }

    @GetMapping
    public ResponseEntity<?> getPage(){
        return new ResponseEntity(mathService.getCategories(), HttpStatus.OK);
    }
}
