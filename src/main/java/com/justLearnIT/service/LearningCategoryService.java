package com.justLearnIT.service;

import com.justLearnIT.model.Category;
import com.justLearnIT.model.Topic;

import java.util.List;

public interface LearningCategoryService {
    List<Topic> getTopicsByCategoryName(String categoryName);

    Category getCategoryByCategoryName(String categoryName);
}
