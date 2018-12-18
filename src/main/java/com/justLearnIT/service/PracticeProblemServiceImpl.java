package com.justLearnIT.service;

import com.justLearnIT.dao.ProblemDAO;
import com.justLearnIT.dao.ProgrammingLanguageDAO;
import com.justLearnIT.dao.SubmitDAO;
import com.justLearnIT.dao.TestDAO;
import com.justLearnIT.model.Problem;
import com.justLearnIT.model.ProgrammingLanguage;
import com.justLearnIT.model.Submit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeProblemServiceImpl implements PracticeProblemService {

    private final ProblemDAO problemDAO;
    private final SubmitDAO submitDAO;
    private final TestDAO testDAO;
    private final ProgrammingLanguageDAO programmingLanguageDAO;

    public PracticeProblemServiceImpl(@Autowired ProblemDAO problemDAO,
                                      @Autowired SubmitDAO submitDAO,
                                      @Autowired TestDAO testDAO,
                                      @Autowired ProgrammingLanguageDAO programmingLanguageDAO) {
        this.problemDAO = problemDAO;
        this.submitDAO = submitDAO;
        this.testDAO = testDAO;
        this.programmingLanguageDAO = programmingLanguageDAO;
    }

    @Override
    public Problem getProblemById(long problemID) {
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
}
