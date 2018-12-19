package com.justLearnIT.service;

import com.justLearnIT.model.Category;
import com.justLearnIT.model.ProblemReact;
import com.justLearnIT.model.ProgrammingLanguage;

import java.util.List;

public interface SendProblemService {
    List<Category> getCategories();

    List<ProgrammingLanguage> getProgrammingLanguagesForCategoryName(String category);

    void convertAndSaveProblem(ProblemReact problemReact);
}
