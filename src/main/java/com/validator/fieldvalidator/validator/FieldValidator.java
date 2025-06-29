package com.validator.fieldvalidator.validator;

import com.validator.fieldvalidator.exception.ValidationException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Fluent validation utility for simplifying user input checks.
 */
public class FieldValidator {

    private final List<String> errors = new ArrayList<>();
    private FieldValidator(){}

    public static FieldValidator validate(){
        return new FieldValidator();
    }

    public FieldValidator notEmpty(String fieldName, String value){
        if (value== null || value.trim().isEmpty() || value.trim().isBlank()){
            errors.add(fieldName + "must not be empty or blank");
        }
        return this;
    }

    public FieldValidator notNull(String fieldName, Object value){
        if (value == null){
            errors.add(fieldName + "is missing, and it is required");
        }
        return this;
    }

    public FieldValidator minLength(String fieldName, String value, int min){
        if (value !=null && value.length() < min){
            errors.add(fieldName + "must be at least " + min + " characters long. ");
        }
        return this;
    }

    public void throwIfInvalidOrNull(){
        if (!errors.isEmpty()){
            throw new ValidationException(String.join("; ", errors));
        }
    }
}
