package com.justLearnIT.service;

import com.justLearnIT.dao.MathCategoryDAO;
import com.justLearnIT.dao.MathTopicDAO;
import com.justLearnIT.model.MathCategory;
import com.justLearnIT.model.MathTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathCategoryServiceImpl implements MathCategoryService {

    private final MathTopicDAO mathTopicDAO;
    private final MathCategoryDAO mathCategoryDAO;

    public MathCategoryServiceImpl(@Autowired MathTopicDAO mathTopicDAO, @Autowired MathCategoryDAO mathCategoryDAO){
        this.mathTopicDAO = mathTopicDAO;
        this.mathCategoryDAO = mathCategoryDAO;
    }

    @Override
    public List<MathTopic> getTopicsByMathCategoryName(String mathCategoryName) {
        return mathTopicDAO.getMathTopicsByMathCategoryName(mathCategoryName);
    }

    @Override
    public MathCategory getMathCategoryByMathCategoryName(String mathCategoryName) {
        return mathCategoryDAO.getCategoryByCategoryName(mathCategoryName);
    }
}
