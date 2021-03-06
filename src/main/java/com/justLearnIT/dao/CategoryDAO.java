package com.justLearnIT.dao;

import com.justLearnIT.model.Category;

import java.util.List;

public interface CategoryDAO {
    List getCategories();

    Category getCategoryByCategoryName(String categoryName);

    void saveOrUpdate(Category category);
}
