package com.spring.librarymanagement.service;

import com.spring.librarymanagement.dao.BookDAO;
import com.spring.librarymanagement.models.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    BookDAO bookDAO;

    @Override
    @ModelAttribute("books")
    public List<BookEntity> getBooks()
    {
        return (List<BookEntity>)bookDAO.findAll();
    }

    @Override
    @Transactional
    public void saveBook(BookEntity bookEntity)
    {
       bookDAO.save(bookEntity);
    }
}
