package com.justLearnIT.service;

import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Submit;
import com.justLearnIT.model.SubmitResult;

import java.util.List;

public interface SubmitResultService {
    Submit getSubmitById(long submitId);

    long getNumberOfTestsByProblem(Problem problem);

    List<SubmitResult> getSubmitResultsBySubmit(Submit submit);

    Problem getProblemBySubmitId(int submitId);
}
