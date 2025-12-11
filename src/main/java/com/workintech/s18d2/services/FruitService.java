package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;

public interface FruitService {
    Fruit save(Fruit fruit);
    List<Fruit> findAll();
    Fruit findById(Long id);
    void deleteById(Long id);

    List<Fruit> findAllByOrderByPriceAsc();
    List<Fruit> findAllByOrderByPriceDesc();
    List<Fruit> findByNameContaining(String name);
}
