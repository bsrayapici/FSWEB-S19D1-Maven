package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Vegetable;
import com.workintech.s18d2.services.VegetableService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/vegetables")
public class VegetableController {

    private final VegetableService vegetableService;

    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }
    @GetMapping
    public List<Vegetable> getVegetablesAsc() {
        return vegetableService.findAllByOrderByPriceAsc();
    }

    @GetMapping("/{id}")
    public Vegetable getVegetableById(@PathVariable Long id) {
        return vegetableService.findById(id);
    }

    @PostMapping
    public Vegetable saveVegetable(@Valid @RequestBody Vegetable vegetable) {
        return  vegetableService.save(vegetable);
    }
    @PostMapping("/{name}")
    public List<Vegetable> searchVegetableByName(@PathVariable String name) {
        return vegetableService.findByNameContaining(name);
    }
    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Long id) {
        vegetableService.deleteById(id);
    }
}
