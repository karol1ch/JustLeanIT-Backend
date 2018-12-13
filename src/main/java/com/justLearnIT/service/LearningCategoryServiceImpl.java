package com.justLearnIT.service;

import com.justLearnIT.dao.CategoryDAO;
import com.justLearnIT.dao.TopicDAO;
import com.justLearnIT.model.Category;
import com.justLearnIT.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningCategoryServiceImpl implements LearningCategoryService {

    private final TopicDAO topicDAO;
    private final CategoryDAO categoryDAO;

    public LearningCategoryServiceImpl(@Autowired TopicDAO topicDAO,
                                       @Autowired CategoryDAO categoryDAO) {
        this.topicDAO = topicDAO;
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Topic> getTopicsByCategoryName(String categoryName) {
        return topicDAO.getTopicsByCategoryName(categoryName);
    }

    @Override
    public Category getCategoryByCategoryName(String categoryName) {
        return categoryDAO.getCategoryByCategoryName(categoryName);
    }
}
