package com.labrats.spring5webapp.controller;

import com.labrats.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: garvit
 * Date: 04/11/19 3:04 PM
 */

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/books")
    public Model getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return model;
    }
}
