package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> getAllFruitsAsc() {
        return fruitService.findAllByOrderByPriceAsc();
    }

    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable Long id) {
        return fruitService.findById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getFruitsDesc() {
        return fruitService.findAllByOrderByPriceDesc();
    }
    @PostMapping
    public Fruit saveFruit(@RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }
    @PostMapping("/{name}")
    public List<Fruit> searchFruitByName(@PathVariable String name) {
        return fruitService.findByNameContaining(name);
    }
    @DeleteMapping("/{id}")
    public void deleteFruitById(@PathVariable Long id) {
        fruitService.deleteById(id);
    }

}