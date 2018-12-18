package com.justLearnIT.dao;

import com.justLearnIT.model.Problem;

public interface TestDAO {
    long getNumberOfTestsByProblem(Problem problem);
}
