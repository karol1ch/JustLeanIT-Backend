package com.justLearnIT.controller;


import com.justLearnIT.model.IncompletedResponse;
import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Submit;
import com.justLearnIT.model.SubmitResult;
import com.justLearnIT.service.SubmitResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/submit/{submitId}")
public class SubmitResultController {

    private final SubmitResultService submitResultService;

    public SubmitResultController(@Autowired SubmitResultService submitResultService) {
        this.submitResultService = submitResultService;
    }

    @GetMapping("/result")
    public ResponseEntity<IncompletedResponse<SubmitResult>> getSubmitResults(@PathVariable("submitId") long submitId) {
        Submit submit = submitResultService.getSubmitById(submitId);

        long numberOfTestsByProblem = submitResultService.getNumberOfTestsByProblem(submit.getProblem());
        List<SubmitResult> results = submitResultService.getSubmitResultsBySubmit(submit);

        IncompletedResponse<SubmitResult> response = new IncompletedResponse<>(results, numberOfTestsByProblem == results.size());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/problem")
    public ResponseEntity<Problem> getProblem(@PathVariable("submitId") int submitId) {
        return new ResponseEntity<>(submitResultService.getProblemBySubmitId(submitId), HttpStatus.OK);
    }

    @GetMapping("/details")
    public ResponseEntity<Submit> getSubmitDetails(@PathVariable("submitId") int submitId) {
        return new ResponseEntity<>(
                Optional.of(submitResultService.getSubmitById(submitId))
                        .filter(Submit::isProcessed)
                        .orElse(null),
                HttpStatus.OK);
    }
}
