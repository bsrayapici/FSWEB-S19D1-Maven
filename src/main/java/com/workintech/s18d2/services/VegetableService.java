package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Vegetable;
import java.util.List;

public interface VegetableService {

    Vegetable save(Vegetable vegetable);

    List<Vegetable> findAll();

    Vegetable findById(Long id);

    void deleteById(Long id);

    List<Vegetable> findByNameContaining(String name);

    List<Vegetable> findAllByOrderByPriceAsc();

    List<Vegetable> findAllByOrderByPriceDesc();
}