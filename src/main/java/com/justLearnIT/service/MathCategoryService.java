package com.justLearnIT.service;

import com.justLearnIT.model.MathCategory;
import com.justLearnIT.model.MathTopic;

import java.util.List;

public interface MathCategoryService {

    List<MathTopic> getTopicsByMathCategoryName(String mathCategoryName);

    MathCategory getMathCategoryByMathCategoryName(String mathCategoryName);
}
