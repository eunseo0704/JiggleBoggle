package com.example.demo.Mapper;

import com.example.demo.domain.RecipeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecipeMapper {

    List<RecipeVO> getAllRecipes();

}
