package com.justLearnIT.service;

import com.justLearnIT.dao.SubmitDAO;
import com.justLearnIT.dao.SubmitResultDAO;
import com.justLearnIT.dao.TestDAO;
import com.justLearnIT.model.Problem;
import com.justLearnIT.model.Submit;
import com.justLearnIT.model.SubmitResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmitResultServiceImpl implements SubmitResultService {

    private final SubmitDAO submitDAO;
    private final TestDAO testDAO;
    private final SubmitResultDAO submitResultDAO;

    public SubmitResultServiceImpl(@Autowired SubmitDAO submitDAO,
                                   @Autowired TestDAO testDAO,
                                   @Autowired SubmitResultDAO submitResultDAO) {
        this.submitDAO = submitDAO;
        this.testDAO = testDAO;
        this.submitResultDAO = submitResultDAO;
    }

    @Override
    public Submit getSubmitById(long submitId) {
        return submitDAO.getSubmitBySubmitId(submitId);
    }

    @Override
    public long getNumberOfTestsByProblem(Problem problem) {
        return testDAO.getNumberOfTestsByProblem(problem);
    }

    @Override
    public List<SubmitResult> getSubmitResultsBySubmit(Submit submit) {
        return submitResultDAO.getAllSubmitResultsBySubmitId(submit);
    }

    @Override
    public Problem getProblemBySubmitId(int submitId) {
        return submitDAO.getSubmitBySubmitId(submitId).getProblem();
    }
}
