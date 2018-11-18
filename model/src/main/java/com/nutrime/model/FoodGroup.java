package com.nutrime.model;

import javax.persistence.*;

@Entity
@Table(name = "FoodGroup")
public class FoodGroup {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;




}
