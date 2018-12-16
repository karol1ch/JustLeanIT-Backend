package com.justLearnIT.service;

import com.justLearnIT.dao.CategoryDAO;
import com.justLearnIT.dao.ProblemDAO;
import com.justLearnIT.model.Category;
import com.justLearnIT.model.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PracticeCategoryServiceImpl implements PracticeCategoryService {

    private final CategoryDAO categoryDAO;
    private final ProblemDAO problemDAO;

    public PracticeCategoryServiceImpl(@Autowired CategoryDAO categoryDAO, @Autowired ProblemDAO problemDAO) {
        this.categoryDAO = categoryDAO;
        this.problemDAO = problemDAO;
    }

    @Override
    public List<Problem> getProblemsByCategoryName(String category) {
        return problemDAO.getProblemsByCategoryName(category);
    }

    @Override
    public Category getCategoryByCategoryName(String category) {
        return categoryDAO.getCategoryByCategoryName(category);
    }
}
