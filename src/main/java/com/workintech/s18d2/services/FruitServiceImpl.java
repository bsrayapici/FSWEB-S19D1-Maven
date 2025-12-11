package com.workintech.s18d2.services;

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
        if(fruit.getName() == null || fruit.getPrice() == null) {
            throw new InvalidDataException("Name or Price cannot be null.");
        }
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit findById(Long id) {
        IdValidator.validate(id);
        return fruitRepository.findById(id).orElseThrow(()-> new NotFoundException("Fruit not found: " + id));
    }


    @Override
    public void deleteById(Long id) {

        IdValidator.validate(id);

        // Silinecek kayıt gerçekten var mı?
        if (!fruitRepository.existsById(id)) {
            throw new NotFoundException("Fruit not found with id: " + id);
        }

        fruitRepository.deleteById(id);
    }

    @Override
    public List<Fruit> findAllByOrderByPriceAsc() {
        return fruitRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Fruit> findAllByOrderByPriceDesc() {
        return fruitRepository.findAllByOrderByPriceDesc();
    }

    @Override
    public List<Fruit> findByNameContaining(String name) {

        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty");
        }

        return fruitRepository.findByNameContaining(name);
    }
}