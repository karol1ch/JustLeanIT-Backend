package com.justLearnIT.controller;


import com.justLearnIT.model.Category;
import com.justLearnIT.model.ProblemReact;
import com.justLearnIT.model.ProgrammingLanguage;
import com.justLearnIT.service.SendProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/sendProblem")
public class SendProblemContoller {

    private final SendProblemService sendProblemService;

    public SendProblemContoller(@Autowired SendProblemService sendProblemService) {
        this.sendProblemService = sendProblemService;
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategories() {
        return new ResponseEntity<>(sendProblemService.getCategories(), HttpStatus.OK);
    }

    @GetMapping("/category={category}/languages")
    public ResponseEntity<List<ProgrammingLanguage>> getProgrammingLanguages(@PathVariable("category") String category) {
        return new ResponseEntity<>(sendProblemService.getProgrammingLanguagesForCategoryName(category), HttpStatus.OK);
    }

    @PostMapping("/submit")
    public ResponseEntity<Void> submitProblem(@RequestBody ProblemReact problemReact) {

        sendProblemService.convertAndSaveProblem(problemReact);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
