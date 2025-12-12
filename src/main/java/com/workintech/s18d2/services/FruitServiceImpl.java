package com.workintech.s18d2.services;

import com.workintech.s18d2.exceptions.PlantException;
import com.workintech.s18d2.repository.FruitRepository;
import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.exceptions.InvalidDataException;
import com.workintech.s18d2.exceptions.NotFoundException;
import com.workintech.s18d2.validations.IdValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FruitServiceImpl implements FruitService {
    private final FruitRepository fruitRepository;

    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit getById(Long id) {
        IdValidator.validate(id);
        return fruitRepository.findById(id).orElseThrow(()-> new PlantException("Fruit not found: " + id));
    }

    @Override
    public Fruit delete(Long id) {
        IdValidator.validate(id);
        var fruit = fruitRepository.findById(id).orElseThrow(()-> new NotFoundException("Fruit not found: " + id));

        fruitRepository.delete(fruit);
        return fruit;
    }


    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public List<Fruit> searchByName(String name) {

        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }

        return fruitRepository.searchByName(name);
    }
}