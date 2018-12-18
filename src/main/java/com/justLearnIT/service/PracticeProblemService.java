package com.justLearnIT.service;

import com.justLearnIT.model.Problem;
import com.justLearnIT.model.ProgrammingLanguage;
import com.justLearnIT.model.Submit;

import java.util.List;

public interface PracticeProblemService {

    Problem getProblemById(int problemID);

    void saveSubmit(Submit submit);

    long getNumberOfTestsByProblem(Problem problem);

    ProgrammingLanguage getProgrammingLanguageByName(String name);

    List<ProgrammingLanguage> getAvailableProgrammingLanguagesForProblem(int problemID);
}
