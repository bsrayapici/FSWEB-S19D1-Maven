package com.workintech.s18d2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vegetable", schema = "fsweb")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "is_grown_on_tree")
    private Boolean isGrownOnTree;

    // Parametresiz constructor
    public Vegetable() {
    }

    // Parametreli constructor
    public Vegetable(Long id, String name, Double price, Boolean isGrownOnTree) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isGrownOnTree = isGrownOnTree;
    }

    // Getter ve Setter metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean isGrownOnTree() {
        return isGrownOnTree;
    }

    public void setGrownOnTree(Boolean grownOnTree) {
        isGrownOnTree = grownOnTree;
    }
}