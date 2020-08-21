/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kristina.libraryspring.validator;

import com.kristina.libraryspring.model.Author;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Kristina
 */
@Component
public class AuthorValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Author.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Author authorDto=(Author) o;
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName",null, "First name is required!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", null,"Last name is required!");
        
    }
    
}
