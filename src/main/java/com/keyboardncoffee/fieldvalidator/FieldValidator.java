package com.keyboardncoffee.fieldvalidator;

/**
 * Fluent validation utility for simplifying user input checks.
 */
public class FieldValidator<T> {

    private final T value;
    private final String fieldName;

    //only accessible from within the class
    private FieldValidator(T value, String fieldName){
        this.value = value;
        this.fieldName = fieldName;
    }

    //uses default field name
    public static <T> FieldValidator<T> check(T value) {
        return new FieldValidator<T>(value, "fieldName");
    }

    //uses custom field name
    public static <T> FieldValidator<T> check(T value, String fieldName) {
        return new FieldValidator<>(value, fieldName);
    }

    public FieldValidator<T> notNull(){
        if (value == null){
            throw new NullPointerException(fieldName + "is missing");
        }
        return this;
    }

    public FieldValidator<T> notBlankOrEmpty(){
        if (value instanceof String){
            String stringInput = (String) value;
            if (stringInput.trim().isBlank() || stringInput.trim().isEmpty()){
                throw new IllegalArgumentException(fieldName + " must not be blank or empty");
            }
        }
        return this;
    }

    // Checks that the String value has at least a minimum number of characters
    public FieldValidator<T> minLength(int length) {
        if (value instanceof String) {
            String str = (String) value;
            if (str.length() < length) {
                throw new IllegalArgumentException(fieldName + " must be at least " + length + " characters long");
            }
        }
        return this;
    }
//
//    // Checks that the String value does not exceed the maximum length
//    public FieldValidator<T> maxLength(int length) {
//        if (value instanceof String) {
//            String str = (String) value;
//            if (str.length() > length) {
//                throw new IllegalArgumentException(fieldName + " must be at most " + length + " characters long");
//            }
//        }
//        return this;
//    }
//
//    // Checks that the String value matches the given regex pattern
//    public FieldValidator<T> matches(String regex) {
//        if (value instanceof String) {
//            String str = (String) value;
//            if (!str.matches(regex)) {
//                throw new IllegalArgumentException(fieldName + " has an invalid format");
//            }
//        }
//        return this;
//    }

}
