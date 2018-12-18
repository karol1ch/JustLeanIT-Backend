package com.justLearnIT.dao;

import com.justLearnIT.model.Submit;
import com.justLearnIT.model.SubmitResult;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class SubmitResultDAOImpl implements SubmitResultDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<SubmitResult> getAllSubmitResultsBySubmitId(Submit submitId) {

        Session session = emf.createEntityManager().unwrap(Session.class);

        return session.createQuery("from SubmitResult where submitId = :submitId")
                .setParameter("submitId", submitId.getId())
                .list();
    }
}
