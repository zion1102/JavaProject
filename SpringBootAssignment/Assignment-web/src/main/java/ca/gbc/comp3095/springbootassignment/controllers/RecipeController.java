package ca.gbc.comp3095.springbootassignment.controllers;

import ca.gbc.comp3095.springbootassignment.services.RecipeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/recipes")
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController (RecipeService recipeService){
        this.recipeService = recipeService;
    }



    @RequestMapping({"/","/index","/index.html",""})
    public String listRecipes(Model model){
        model.addAttribute("Recipes",recipeService.findALl());
        return "recipes/index";
    }

}
