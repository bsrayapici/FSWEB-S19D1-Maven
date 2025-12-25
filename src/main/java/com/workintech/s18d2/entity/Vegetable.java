package com.workintech.s18d2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vegetable")
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @Column(name = "is_grown_on_tree")
    private boolean grownOnTree;

    // ZORUNLU
    public Vegetable() {
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

    // DİKKAT: test isGrownOnTree() çağırıyor
    public boolean isGrownOnTree() {
        return grownOnTree;
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

    public void setGrownOnTree(boolean grownOnTree) {
        this.grownOnTree = grownOnTree;
    }
}