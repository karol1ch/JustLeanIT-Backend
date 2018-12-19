package com.justLearnIT.dao;

import com.justLearnIT.model.MathTopic;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class MathTopicDAOImpl implements MathTopicDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public MathTopic getMathTopicById(int mathTopicId) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("FROM MathTopic WHERE id = :id");
        query.setParameter("id", mathTopicId);
        List list = query.list();
        return (MathTopic) list.get(0);
    }

    @Override
    public List<MathTopic> getMathTopicsByMathCategoryName(String mathCategoryName) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("FROM MathTopic WHERE category.name = :category");
        query.setParameter("category", mathCategoryName);
        return query.list();

    }

    @Override
    public void saveOrUpdate(MathTopic mathTopic) {

    }
}
