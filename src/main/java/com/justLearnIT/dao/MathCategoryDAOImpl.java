package com.justLearnIT.dao;

import com.justLearnIT.model.MathCategory;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

import java.util.List;

@Repository
public class MathCategoryDAOImpl implements MathCategoryDAO {


    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<MathCategory> getCategories() {
        Session session = emf.createEntityManager().unwrap(Session.class);
        return session.createQuery("FROM  MathCategory ").list();
    }

    @Override
    public MathCategory getCategoryByCategoryName(String categoryName) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("FROM MathCategory  WHERE name = :name");
        query.setParameter("name", categoryName);
        List list =  query.list();
        if (list.size() > 0) return (MathCategory) list.get(0);
        else return new MathCategory("Not Found", "Not Found");
    }

    @Override
    public void saveOrUpdate(MathCategory category) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        session.saveOrUpdate(category);
    }
}
