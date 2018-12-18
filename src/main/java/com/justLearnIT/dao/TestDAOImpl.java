package com.justLearnIT.dao;

import com.justLearnIT.model.Problem;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class TestDAOImpl implements TestDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public long getNumberOfTestsByProblem(Problem problem) {
        Session session = emf.createEntityManager().unwrap(Session.class);

        System.out.println(problem);

        return session.createQuery("from Test where problem.id = :problemId")
                .setParameter("problemId", problem.getId())
                .list()
                .size();
                //.getFetchSize();
    }
}
