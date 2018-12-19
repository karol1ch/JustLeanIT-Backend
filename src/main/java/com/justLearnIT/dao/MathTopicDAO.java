package com.justLearnIT.dao;

import com.justLearnIT.model.MathTopic;

import java.util.List;

public interface MathTopicDAO {
    MathTopic getMathTopicById(int mathTopicId);
    List<MathTopic> getMathTopicsByMathCategoryName(String mathCategoryName);
    void saveOrUpdate(MathTopic mathTopic);
}
