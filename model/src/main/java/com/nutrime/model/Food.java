package com.nutrime.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal unitsPerPortion;

    @NotNull
    private UnitType unitType;

    @ManyToOne(optional = false)
    private FoodGroup foodGroup;

}
