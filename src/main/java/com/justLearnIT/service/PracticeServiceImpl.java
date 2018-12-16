package com.justLearnIT.service;

import com.justLearnIT.dao.CategoryDAO;
import com.justLearnIT.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeServiceImpl implements PracticeService {

    private final CategoryDAO categoryDAO;

    public PracticeServiceImpl(@Autowired CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Category> getCategories() {
        return categoryDAO.getCategories();
    }
}
