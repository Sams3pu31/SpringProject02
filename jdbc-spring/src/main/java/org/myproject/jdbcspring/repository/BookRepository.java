package org.myproject.jdbcspring.repository;

import org.myproject.jdbcspring.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBookById(Long id);
}

