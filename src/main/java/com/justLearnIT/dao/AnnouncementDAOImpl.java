package com.justLearnIT.dao;


import com.justLearnIT.model.Announcement;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class AnnouncementDAOImpl implements AnnouncementDAO {

    @Autowired
    EntityManagerFactory emf;


    @Override
    public List<Announcement> getAnnouncements() {
        Session session = emf.createEntityManager().unwrap(Session.class);
        List list = new ArrayList();
        list.addAll(session.createQuery("FROM Announcement ").list());
        Collections.reverse(list);
        return  list;
    }

    @Override
    public Announcement getAnnouncementByName(String announcementName) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("FROM Announcement WHERE name = :name");
        query.setParameter("name", announcementName);
        List list = query.list();
        System.out.println(list.get(0));
        if (list.size() > 0) return (Announcement) list.get(0);
        else return new Announcement("Not found", "Not found", "Not found");
    }


    @Override
    public void saveOrUpdate(Announcement announcement) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        session.saveOrUpdate(announcement);

    }
}
