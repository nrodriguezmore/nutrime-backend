package com.nutrime.api.controllers;

import com.nutrime.api.services.FoodGroupService;
import com.nutrime.dao.FoodGroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/foodgroups")
public class FoodGroupController {

    @Autowired
    private FoodGroupService foodGroupService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<FoodGroupDao> list() {

        return foodGroupService.list();
    }



}
