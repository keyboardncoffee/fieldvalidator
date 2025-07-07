package com.validator;

import com.keyboardncoffee.fieldvalidator.FieldValidator;
import org.springframework.stereotype.Service;

@Service
public class ValidateAccess {

    private FieldValidator fieldValidator;

    public FieldValidator checkNotNull(){
        return fieldValidator.notNull();
    }

    public FieldValidator checkBlank(){
        return fieldValidator.notBlankOrEmpty();
    }

    public FieldValidator checkMinLength(int length){
        return fieldValidator.minLength(length);
    }
}
