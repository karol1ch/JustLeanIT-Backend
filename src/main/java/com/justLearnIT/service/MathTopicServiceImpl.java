package com.justLearnIT.service;

import com.justLearnIT.dao.MathTopicDAO;
import com.justLearnIT.model.MathTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathTopicServiceImpl implements MathTopicService {

    private final MathTopicDAO mathTopicDAO;

    public MathTopicServiceImpl(@Autowired MathTopicDAO mathTopicDAO){
        this.mathTopicDAO = mathTopicDAO;
    }

    @Override
    public MathTopic getTopicById(int mathTopicId) {
        return mathTopicDAO.getMathTopicById(mathTopicId);
    }
}
