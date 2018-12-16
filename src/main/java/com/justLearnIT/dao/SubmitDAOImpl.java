package com.justLearnIT.dao;

import com.justLearnIT.model.Submit;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class SubmitDAOImpl implements SubmitDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<Submit> getSubmits() {
        Session session = emf.createEntityManager().unwrap(Session.class);
        return session.createQuery("from Submit").list();
    }

    @Override
    public Submit getSubmitBySubmitId(int submitId) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("from Submit where id = :id");
        query.setParameter("id", submitId);
        List list = query.list();
        return (Submit) list.get(0);
    }

    @Override
    public void saveOrUpdate(Submit submit) {
        Session session =emf.createEntityManager().unwrap(Session.class);
        session.saveOrUpdate(submit);
    }

}
