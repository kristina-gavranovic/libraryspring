/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kristina.libraryspring.controller;

import com.kristina.libraryspring.model.Author;
import com.kristina.libraryspring.service.AuthorService;
import com.kristina.libraryspring.validator.AuthorValidator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Kristina
 */
@Controller
@RequestMapping(path = {"/author"})
public class AuthorController {

    @Autowired
    private final AuthorService authorService;
    @Autowired
    private final AuthorValidator authorValidator;

    public AuthorController(AuthorService authorService, AuthorValidator authorValidator) {
        this.authorService = authorService;
        this.authorValidator = authorValidator;
    }

    @GetMapping
    public String home() {
        return "author/home";
    }

    @GetMapping(path = {"add"})
    public String add(HttpServletRequest request, HttpServletResponse response) {
        Author authorDto = new Author(-1L, "/", "/");
        request.setAttribute("authorDto", authorDto);
        return "author/add";
    }

//    @PostMapping(path={"save"})
//    public String save(HttpServletRequest request, HttpServletResponse response, RedirectAttributes redirectAttributes){
//        String firstName=request.getParameter("firstName").trim();
//        String lastName=request.getParameter("lastName").trim();
//        
//        System.out.println("Sacuvan autor: "+firstName+" "+lastName);
//        
//        
//        AuthorDto authorDto=new AuthorDto(firstName, lastName);
//        authorService.save(authorDto);
//        redirectAttributes.addFlashAttribute("message", "Author is saved!");
//        return "redirect:/author/add";
//    }
    @PostMapping(path = {"save"})
    public String save(@ModelAttribute(name = "authorDto") @Validated Author authorDto,
            BindingResult result, RedirectAttributes redirectAttributes, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("invalid", "One or more fields are invalid!");
            return "author/add";
        } else {
            redirectAttributes.addFlashAttribute("message", "Author is saved!");
            redirectAttributes.addFlashAttribute("author", authorService.save(authorDto));
        }

        return "redirect:/author/add";
    }

    @InitBinder
    protected void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setValidator(authorValidator);
    }

}
