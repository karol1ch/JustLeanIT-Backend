package com.justLearnIT.controller;

import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Submit;
import com.justLearnIT.service.PracticeProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin
@RestController
@RequestMapping("/practice/{category}/{problemID}")
public class PracticeProblemController {

    private final PracticeProblemService practiceProblemService;


    public PracticeProblemController(@Autowired PracticeProblemService practiceProblemService) {
        this.practiceProblemService = practiceProblemService;
    }

    @GetMapping
    public ResponseEntity<Problem> getProblem(@PathVariable("problemID") long problemID) {
        return new ResponseEntity<>(practiceProblemService.getProblemById(problemID), HttpStatus.OK);
    }

    @PostMapping("/submit")
    public ResponseEntity<Void> registerSubmit(@PathVariable("category") String category, @PathVariable("problemID") int problemId, @RequestBody Submit submit) {
        submit.setProblem(practiceProblemService.getProblemById(problemId));
        submit.setProgrammingLanguage(practiceProblemService.getProgrammingLanguageByName(category));

        practiceProblemService.saveSubmit(submit);

        System.out.println(submit);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/result").buildAndExpand().toUri();

        return ResponseEntity.created(location).build();
    }

}
