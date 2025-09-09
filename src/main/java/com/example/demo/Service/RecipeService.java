package com.example.demo.Service;

import com.example.demo.Mapper.RecipeMapper;
import com.example.demo.domain.RecipeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public List<RecipeVO> getAllRecipes(){
        return recipeMapper.getAllRecipes();
    }



}
