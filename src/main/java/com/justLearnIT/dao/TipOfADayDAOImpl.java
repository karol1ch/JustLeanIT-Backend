package com.justLearnIT.dao;

import com.justLearnIT.model.TipOfADay;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Random;

@Repository
public class TipOfADayDAOImpl implements TipOfADayDAO{

    @Autowired
    EntityManagerFactory emf;

    @Override
    public TipOfADay getRandTip() {
        Session session = emf.createEntityManager().unwrap(Session.class);
        List list = session.createQuery("FROM tip ").list();
        Random rand = new Random();
        return (TipOfADay) list.get(rand.nextInt(list.size()));
    }
}
