package com.justLearnIT.controller;

import com.justLearnIT.model.Problem;
import com.justLearnIT.model.ProgrammingLanguage;
import com.justLearnIT.model.Submit;
import com.justLearnIT.model.SubmitReact;
import com.justLearnIT.service.PracticeProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/practice/{category}/{problemID}")
public class PracticeProblemController {

    private final PracticeProblemService practiceProblemService;


    public PracticeProblemController(@Autowired PracticeProblemService practiceProblemService) {
        this.practiceProblemService = practiceProblemService;
    }

    @GetMapping
    public ResponseEntity<Problem> getProblem(@PathVariable("problemID") int problemID) {
        return new ResponseEntity<>(practiceProblemService.getProblemById(problemID), HttpStatus.OK);
    }

    @GetMapping("/availableLanguages")
    public ResponseEntity<List<ProgrammingLanguage>> getAvailableLanguagesForProblem(
            @PathVariable("problemID") int problemID) {
        return new ResponseEntity<>(practiceProblemService.getAvailableProgrammingLanguagesForProblem(problemID), HttpStatus.OK);
    }

    @PostMapping("/submit")
    public ResponseEntity<Integer> registerSubmit(@PathVariable("problemID") int problemId, @RequestBody SubmitReact submitReact) {

        Submit submit = Submit.builder()
                .codeContent(submitReact.getCodeContent())
                .username(submitReact.getUsername())
                .programmingLanguage(practiceProblemService.getProgrammingLanguageByName(submitReact.getProgrammingLanguageName()))
                .problem(practiceProblemService.getProblemById(problemId))
                .build();

        practiceProblemService.saveSubmit(submit);

        System.out.println(submit);

        return new ResponseEntity<>(submit.getId(), HttpStatus.OK);
    }


}
