package com.justLearnIT.service;

import com.justLearnIT.dao.*;
import com.justLearnIT.model.Problem;
import com.justLearnIT.model.ProgrammingLanguage;
import com.justLearnIT.model.Submit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeProblemServiceImpl implements PracticeProblemService {

    private final ProblemDAO problemDAO;
    private final SubmitDAO submitDAO;
    private final TestDAO testDAO;
    private final ProgrammingLanguageDAO programmingLanguageDAO;
    private final AvailableProgrammingLanguageDAO availableProgrammingLanguageDAO;

    public PracticeProblemServiceImpl(@Autowired ProblemDAO problemDAO,
                                      @Autowired SubmitDAO submitDAO,
                                      @Autowired TestDAO testDAO,
                                      @Autowired ProgrammingLanguageDAO programmingLanguageDAO,
                                      @Autowired AvailableProgrammingLanguageDAO availableProgrammingLanguageDAO) {
        this.problemDAO = problemDAO;
        this.submitDAO = submitDAO;
        this.testDAO = testDAO;
        this.programmingLanguageDAO = programmingLanguageDAO;
        this.availableProgrammingLanguageDAO = availableProgrammingLanguageDAO;
    }

    @Override
    public Problem getProblemById(int problemID) {
        return problemDAO.getProblemById(problemID);
    }

    @Override
    public void saveSubmit(Submit submit) {
        submitDAO.saveOrUpdate(submit);
    }

    @Override
    public long getNumberOfTestsByProblem(Problem problem) {
        return testDAO.getNumberOfTestsByProblem(problem);
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguageByName(String name) {
        return programmingLanguageDAO.getProgrammingLanguageByName(name);
    }

    @Override
    public List<ProgrammingLanguage> getAvailableProgrammingLanguagesForProblem(int problemID) {
        return availableProgrammingLanguageDAO.getAvailableProgrammingLanguagesForProblem(problemID);
    }
}
