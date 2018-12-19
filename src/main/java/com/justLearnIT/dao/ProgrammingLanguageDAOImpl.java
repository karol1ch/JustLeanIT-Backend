package com.justLearnIT.dao;

import com.justLearnIT.model.ProgrammingLanguage;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class ProgrammingLanguageDAOImpl implements ProgrammingLanguageDAO {

    @Autowired
    EntityManagerFactory emf;

    @Override
    public ProgrammingLanguage getProgrammingLanguageByName(String name) {
        Session session = emf.createEntityManager().unwrap(Session.class);

        return session.get(ProgrammingLanguage.class, name);
    }

    @Override
    public List<ProgrammingLanguage> getProgrammingLanguages() {
        Session session = emf.createEntityManager().unwrap(Session.class);

        return session.createQuery("from ProgrammingLanguage")
                .list();
    }
}
