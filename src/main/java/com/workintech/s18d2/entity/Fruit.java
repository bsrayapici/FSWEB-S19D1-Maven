package com.workintech.s18d2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fruit")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

    // ZORUNLU: JPA + testler için
    public Fruit() {
    }

    // ---------- GETTERS ----------

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    // ---------- SETTERS ----------

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
    }
}