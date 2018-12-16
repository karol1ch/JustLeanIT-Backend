package com.justLearnIT.service;

import com.justLearnIT.model.Submit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubmitsServiceImpl implements SubmitsService {
    @Override
    public List<Submit> getSubmits() {
        return null;
        //return SubmitsDAO.getSubmits();
    }
}
