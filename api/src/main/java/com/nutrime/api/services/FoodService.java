package com.nutrime.api.services;


import com.nutrime.dao.FoodDao;

import java.util.List;
import java.util.Map;

public interface FoodService {


    public List<FoodDao> list(Map<String, Object> criteria);

    public FoodDao get();

    public FoodDao create();

    public void delete();

    public FoodDao update();

}
