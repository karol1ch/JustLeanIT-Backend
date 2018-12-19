package com.justLearnIT.dao;

import com.justLearnIT.model.Problem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class ProblemDAOImpl implements ProblemDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<Problem> getProblemsByCategoryName(String category) {
        Session session = emf.createEntityManager().unwrap(Session.class);

        return session.createQuery("from Problem where category.name = :categoryName")
                .setParameter("categoryName", category)
                .list();
    }

    @Override
    public Problem getProblemById(int problemID) {
        Session session = emf.createEntityManager().unwrap(Session.class);

        return session.get(Problem.class, problemID);
    }

    @Override
    public void save(Problem problem) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Transaction tx = session.beginTransaction();
        session.save(problem);
        tx.commit();
    }
}
