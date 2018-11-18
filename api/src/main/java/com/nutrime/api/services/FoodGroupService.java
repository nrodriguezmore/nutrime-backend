package com.nutrime.api.services;


import com.nutrime.dao.FoodGroupDao;

import java.util.List;

public interface FoodGroupService {


    public List<FoodGroupDao> list();

    public FoodGroupDao get();

    public FoodGroupDao create();

    public void delete();

    public FoodGroupDao update();

}
