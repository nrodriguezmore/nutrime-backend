package com.nutrime.api.controllers;

import com.nutrime.api.services.FoodService;
import com.nutrime.dao.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<FoodDao> list() {

        return foodService.list(new HashMap<String, Object>());
    }



}
