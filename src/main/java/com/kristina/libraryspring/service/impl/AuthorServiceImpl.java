/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kristina.libraryspring.service.impl;

import com.kristina.libraryspring.dao.AuthorDao;
import com.kristina.libraryspring.model.Author;
import com.kristina.libraryspring.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorDao authorDao;

    @Override
    public Author save(Author author) {
        return authorDao.save(author);
    }
    
}
