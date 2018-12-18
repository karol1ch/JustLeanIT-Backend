package com.justLearnIT.service;

import com.justLearnIT.dao.TopicDAO;
import com.justLearnIT.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearningTopicServiceImpl implements LearningTopicService {

    private final TopicDAO topicDAO;

    public LearningTopicServiceImpl(@Autowired TopicDAO topicDAO) {
        this.topicDAO = topicDAO;
    }

    @Override
    public Topic getTopicById(int topicId) {
        return topicDAO.getTopicById(topicId);
    }
}
