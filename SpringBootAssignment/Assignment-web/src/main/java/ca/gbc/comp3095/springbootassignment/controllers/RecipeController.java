package ca.gbc.comp3095.springbootassignment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    @RequestMapping({"/recipes","/recipes/inde","/recipes/index.html"})
    public String listRecipes(){
        return "recipes/index";
    }

}
