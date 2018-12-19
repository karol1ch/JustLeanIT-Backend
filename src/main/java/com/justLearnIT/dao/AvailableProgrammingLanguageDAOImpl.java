package com.justLearnIT.dao;

import com.justLearnIT.model.AvailableProgrammingLanguage;
import com.justLearnIT.model.ProgrammingLanguage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class AvailableProgrammingLanguageDAOImpl implements AvailableProgrammingLanguageDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<ProgrammingLanguage> getAvailableProgrammingLanguagesForProblem(int problemID) {
        Session session = emf.createEntityManager().unwrap(Session.class);

        return session.createQuery("select apl.programmingLanguage from AvailableProgrammingLanguage apl where apl.problem.id = :problemID")
                .setParameter("problemID", problemID)
                .list();
    }

    @Override
    public void save(AvailableProgrammingLanguage availableProgrammingLanguage) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Transaction tx = session.beginTransaction();
        session.merge(availableProgrammingLanguage);
        tx.commit();
    }
}
