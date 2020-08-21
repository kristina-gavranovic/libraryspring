/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kristina.libraryspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kristina
 */
@Controller
public class LoginController {
    
    @RequestMapping(value = {"/login"})
    public String login(){
        return "/login";
    }
    
}
