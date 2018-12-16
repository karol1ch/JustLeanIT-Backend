package com.justLearnIT.service;

import com.justLearnIT.dao.SubmitDAO;
import com.justLearnIT.model.Submit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubmitsServiceImpl implements SubmitsService {

    private final SubmitDAO submitDAO;

    public SubmitsServiceImpl(@Autowired SubmitDAO submitDAO) {
        this.submitDAO = submitDAO;
    }
    @Override
    public List<Submit> getSubmits() {
        return submitDAO.getSubmits();
    }
}
