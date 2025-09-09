package com.example.demo.controller;

import com.example.demo.Service.RecipeService;
import com.example.demo.domain.RecipeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/recipe")
    public String recipePage(Model model) {

        List<RecipeVO> recipeList = recipeService.getAllRecipes();

        model.addAttribute("recipeList", recipeList);

        return "recipe/recipePage";
    }
}
