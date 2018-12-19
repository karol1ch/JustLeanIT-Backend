package com.justLearnIT.dao;

import com.justLearnIT.model.MathCategory;

import java.util.List;

public interface MathCategoryDAO {

    List getCategories();

    MathCategory getCategoryByCategoryName(String categoryName);

    void saveOrUpdate(MathCategory category);
}
