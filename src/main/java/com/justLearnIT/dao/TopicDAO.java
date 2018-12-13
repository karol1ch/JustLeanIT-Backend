package com.justLearnIT.dao;

import com.justLearnIT.model.Topic;
import java.util.List;

public interface TopicDAO {
    List<Topic> getTopicsByCategoryName(String categoryName);

    Topic getTopicById(long topicId);
}
