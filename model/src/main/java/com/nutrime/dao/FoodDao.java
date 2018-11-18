package com.nutrime.dao;

import com.nutrime.model.FoodGroup;
import com.nutrime.model.UnitType;

import java.math.BigDecimal;

public class FoodDao {

    private final Integer id;
    private final String name;
    private final BigDecimal unitsPerPortion;
    private final UnitType unitType;
    private final FoodGroupDao foodGroupDao;

    public FoodDao(FoodDaoBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.unitsPerPortion = builder.unitsPerPortion;
        this.unitType = builder.unitType;
        this.foodGroupDao = builder.foodGroupDao;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getUnitsPerPortion() {
        return unitsPerPortion;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public FoodGroupDao getFoodGroupDao() {
        return foodGroupDao;
    }

    public static class FoodDaoBuilder {
        private Integer id;
        private String name;
        private BigDecimal unitsPerPortion;
        private UnitType unitType;
        private FoodGroupDao foodGroupDao;

        public FoodDaoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public FoodDaoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FoodDaoBuilder unitsPerPortion(BigDecimal unitsPerPortion) {
            this.unitsPerPortion = unitsPerPortion;
            return this;
        }

        public FoodDaoBuilder unitType(UnitType unitType) {
            this.unitType = unitType;
            return this;
        }

        public FoodDaoBuilder foodGroupDao(FoodGroupDao foodGroupDao) {
            this.foodGroupDao = foodGroupDao;
            return this;
        }

        public FoodDao build() {
            return new FoodDao(this);
        }
    }
}
