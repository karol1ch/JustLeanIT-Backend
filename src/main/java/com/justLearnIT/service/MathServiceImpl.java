package com.justLearnIT.service;

import com.justLearnIT.dao.MathCategoryDAO;
import com.justLearnIT.model.MathCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathServiceImpl implements MathService {

    private final MathCategoryDAO mathCategoryDAO;

    public MathServiceImpl(@Autowired MathCategoryDAO mathCategoryDAO){
        this.mathCategoryDAO = mathCategoryDAO;
    }

    @Override
    public List<MathCategory> getCategories() {
        return mathCategoryDAO.getCategories();
    }
}
