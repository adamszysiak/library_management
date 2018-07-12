package com.spring.librarymanagement.controllers;

import com.spring.librarymanagement.models.BookEntity;
import com.spring.librarymanagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/")
@Controller
public class BookController
{
    @Autowired
    BookService bookService;

    @GetMapping("/books")
    String getBooks(Model model)
    {
        List<BookEntity> bookList = bookService.getBooks();
        model.addAttribute("books", bookList);
        return "/books/bookList";
    }

    @GetMapping("/books/bookForm")
    String showBookForm(Model model)
    {
        BookEntity bookEntity = new BookEntity();
        model.addAttribute("saveBook", bookEntity);
        return "/books/addBookForm";
    }

    @PostMapping("/saveBook")
    String addBook(@ModelAttribute("saveBook") /*@Valid */BookEntity saveBook, BindingResult bindingResult, Model model)
    {
        if (bindingResult.hasErrors())
        {
            model.addAttribute("saveBook",saveBook);
//            return "/books/addBookForm";
        }
//        BookEntity book = new BookEntity();
//        model.addAttribute("saveBook",new BookEntity());
//            model.addAttribute("saveBook",saveBook);

        bookService.saveBook(saveBook);

        return "redirect:/books";
    }

}
