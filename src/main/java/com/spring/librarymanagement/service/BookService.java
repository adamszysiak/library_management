package com.spring.librarymanagement.service;

import com.spring.librarymanagement.models.BookEntity;

import java.util.List;

public interface BookService
{
    List<BookEntity> getBooks();
    void saveBook(BookEntity bookEntity);
}
