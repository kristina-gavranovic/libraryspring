package com.kristina.libraryspring.dao;

import com.kristina.libraryspring.model.Author;
import org.springframework.stereotype.Repository;

public interface AuthorDao {

    Author save(Author author);
}