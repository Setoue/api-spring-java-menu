package com.menu_s.menu.controller;

import java.util.List;

import com.menu_s.menu.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menu_s.menu.food.Food;
import com.menu_s.menu.food.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        return repository.findAll().stream().map(FoodResponseDTO::new).toList();
    }
}
