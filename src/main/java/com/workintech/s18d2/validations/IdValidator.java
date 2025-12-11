package com.workintech.s18d2.validations;

import com.workintech.s18d2.exceptions.InvalidIdException;

public class IdValidator {

    public static void validate(Long id) {
        if (id == null) {
            throw new InvalidIdException("Id cannot be null");
        }

        if (id < 0) {
            throw new InvalidIdException("Id cannot be negative: " + id);
        }
    }
}