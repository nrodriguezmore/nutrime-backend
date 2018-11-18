package com.nutrime.api.services;

import com.nutrime.dao.FoodDao;
import com.nutrime.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FoodServiceImpl implements FoodService {


    @Autowired
    private FoodRepository foodRepository;

    public List<FoodDao> list(Map<String, Object> criteria) {



        return new ArrayList<FoodDao>();
    }

    public FoodDao get() {

        return null;
    }

    public FoodDao create() {

        return null;
    }

    public void delete() {
        return;
    }

    public FoodDao update() {

        return null;
    }

}
