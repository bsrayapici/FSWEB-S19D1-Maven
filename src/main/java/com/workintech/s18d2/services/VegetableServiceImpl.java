package com.workintech.s18d2.services;

import com.workintech.s18d2.repository.VegetableRepository;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableServiceImpl implements VegetableService {

    private final VegetableRepository vegetableRepository;

    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> findAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable findById(Long id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        vegetableRepository.deleteById(id);
    }

    @Override
    public List<Vegetable> findByNameContaining(String name) {
        return vegetableRepository.findByNameContaining(name);
    }

    @Override
    public List<Vegetable> findAllByOrderByPriceAsc() {
        return vegetableRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Vegetable> findAllByOrderByPriceDesc() {
        return vegetableRepository.findAllByOrderByPriceDesc();
    }
}