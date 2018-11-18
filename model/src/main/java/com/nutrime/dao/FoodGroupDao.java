package com.nutrime.dao;

public class FoodGroupDao {

    private final Integer id;
    private final String name;

    public FoodGroupDao(FoodGroupDaoBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static class FoodGroupDaoBuilder {
        private Integer id;
        private String name;

        public FoodGroupDaoBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public FoodGroupDaoBuilder name(String name) {
            this.name = name;
            return this;
        }
    }
}
