package com.justLearnIT.dao;

import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Test;

public interface TestDAO {
    long getNumberOfTestsByProblem(Problem problem);

    void save(Test test);
}
