package com.justLearnIT.service;

import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Submit;

public interface PracticeProblemService {
    Problem getProblemById(long problemID);

    void saveSubmit(Submit submit);
}
