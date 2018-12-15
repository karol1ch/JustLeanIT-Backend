package com.justLearnIT.service;

import com.justLearnIT.model.Category;
import com.justLearnIT.model.Problem;

import java.util.List;

public interface PracticeCategoryService {
    List<Problem> getProblemsByCategoryName(String category);

    Category getCategoryByCategoryName(String category);
}
