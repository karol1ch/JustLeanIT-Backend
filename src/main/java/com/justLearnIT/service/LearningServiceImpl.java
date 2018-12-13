package com.justLearnIT.service;

import com.justLearnIT.dao.CategoryDAO;
import com.justLearnIT.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningServiceImpl implements LearningService {

    private final CategoryDAO categoryDAO;

    public LearningServiceImpl(@Autowired CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Category> getCategories() {
        return categoryDAO.getCategories();
    }
}
