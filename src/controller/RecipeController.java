package me.recipe.homework.controller;

import me.recipe.homework.service.RecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")

public class RecipeController {
    private final RecipeService recipeService;
    @GetMapping
    public Collection<me.recipe.homework.model.Recipe> getAllRecipe() {
        return recipeService.getAll();
    }
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
}