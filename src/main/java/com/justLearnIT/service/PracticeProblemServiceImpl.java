package com.justLearnIT.service;

import com.justLearnIT.dao.ProblemDAO;
import com.justLearnIT.dao.SubmitDAO;
import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Submit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeProblemServiceImpl implements PracticeProblemService {

    private final ProblemDAO problemDAO;
    private final SubmitDAO submitDAO;

    public PracticeProblemServiceImpl(@Autowired ProblemDAO problemDAO,
                                      @Autowired SubmitDAO submitDAO) {
        this.problemDAO = problemDAO;
        this.submitDAO = submitDAO;
    }

    @Override
    public Problem getProblemById(long problemID) {
        return problemDAO.getProblemById(problemID);
    }

    @Override
    public void saveSubmit(Submit submit) {
        submitDAO.saveOrUpdate(submit);
    }
}
