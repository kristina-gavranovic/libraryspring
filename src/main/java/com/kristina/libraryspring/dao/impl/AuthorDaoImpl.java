package com.kristina.libraryspring.dao.impl;

import com.kristina.libraryspring.dao.AuthorDao;
import com.kristina.libraryspring.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AuthorDaoImpl implements AuthorDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Author save(Author author) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(author);
        return author;
    }
}
