package com.haojie.dao;


import javax.annotation.Resource;

import com.haojie.entity.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class UsersDAO {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Transactional
    public List<Users> getAllUser() {
        String hsql = "from users";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hsql);
        List<Users> list = (List<Users>) query.list();
        return list;
    }
}
