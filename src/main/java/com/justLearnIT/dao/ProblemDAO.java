package com.justLearnIT.dao;

import com.justLearnIT.model.Problem;

import java.util.List;

public interface ProblemDAO {
    List<Problem> getProblemsByCategoryName(String category);

    Problem getProblemById(long problemID);
}
