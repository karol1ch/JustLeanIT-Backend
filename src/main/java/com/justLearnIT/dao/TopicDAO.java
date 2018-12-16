package com.justLearnIT.dao;

import com.justLearnIT.model.Topic;
import java.util.List;

public interface TopicDAO {
    Topic getTopicById(int topicID);
    List<Topic> getTopicsByCategoryName(String categoryName);
    void saveOrUpdate(Topic topic);
}
