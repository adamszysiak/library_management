package com.spring.librarymanagement.dao;

import com.spring.librarymanagement.models.BookEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface BookDAO extends CrudRepository<BookEntity,Long>
{

}

