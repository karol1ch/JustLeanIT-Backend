package com.justLearnIT.dao;

import com.justLearnIT.model.Category;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<Category> getCategories() {
        Session session = emf.createEntityManager().unwrap(Session.class);
        return session.createQuery("from Category ").list();
    }

    @Override
    public Category getCategoryByCategoryName(String categoryName) {
        Session session = emf.createEntityManager().unwrap(Session.class);
        Query query = session.createQuery("from Category where name = :name");
        query.setParameter("name", categoryName);
        List list = query.list();

        if (list.size() > 0) return (Category) list.get(0);
        else return  new Category("NOT FOUND", "NOT FOUND");
}

    @Override
    public void saveOrUpdate(Category category) {
        Session session =emf.createEntityManager().unwrap(Session.class);
        session.saveOrUpdate(category);
    }
}
