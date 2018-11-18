package com.nutrime.repository;

import com.nutrime.model.FoodGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodGroupRepository extends CrudRepository<FoodGroup, Integer> {

}
