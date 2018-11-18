package com.nutrime.api.services;

import com.nutrime.dao.FoodGroupDao;
import com.nutrime.repository.FoodGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodGroupServiceImpl implements FoodGroupService {


    @Autowired
    private FoodGroupRepository foodGroupRepository;

    public List<FoodGroupDao> list() {

        return new ArrayList<FoodGroupDao>();
    }

    public FoodGroupDao get() {

        return null;
    }

    public FoodGroupDao create() {

        return null;
    }

    public void delete() {
        return;
    }

    public FoodGroupDao update() {

        return null;
    }

}
