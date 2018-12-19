package com.justLearnIT.controller;

import com.justLearnIT.model.PaginatedResponse;
import com.justLearnIT.model.Submit;
import com.justLearnIT.service.SubmitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/submits")
public class SubmitsController {
    private final SubmitsService submitsService;

    public SubmitsController(@Autowired SubmitsService submitsService) {
        this.submitsService = submitsService;
    }

    @GetMapping
    public ResponseEntity<List<Submit>> getPage() {
        return new ResponseEntity<>(submitsService.getSubmits(), HttpStatus.OK);
    }

    @GetMapping("/page={pageNumber}")
    public ResponseEntity<PaginatedResponse<Submit>> getSubmitsPaginated(@PathVariable("pageNumber") int pageNumber) {
        PaginatedResponse<Submit> response = new PaginatedResponse<>(submitsService.getSubmits(), pageNumber);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
