package com.justLearnIT.dao;


import com.justLearnIT.model.Topic;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class TopicDAOImpl implements TopicDAO {
    @Autowired
    EntityManagerFactory emf;

    @Override
    public Topic getTopicById(int topicId) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("from Topic where id = :id");
        query.setParameter("id", topicId);
        List list = query.list();
        return (Topic) list.get(0);
    }

    @Override
    public List<Topic> getTopicsByCategoryName(String categoryName) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("from Topic where category.name = :category_name");
        query.setParameter("category_name", categoryName);


        System.out.println(query.list());
        return query.list();
    }

    @Override
    public void saveOrUpdate(Topic topic) {

    }
}
