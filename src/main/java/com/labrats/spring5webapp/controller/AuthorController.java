package com.labrats.spring5webapp.controller;

import com.labrats.spring5webapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: garvit
 * Date: 04/11/19 3:04 PM
 */

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public Model getBooks(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return model;
    }
}
