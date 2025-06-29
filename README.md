# A simple Field Validator

A fluent, expressive validation library for Spring Boot and Java applications.

## Quick Example

```java
FieldValidator.validate()
    .notEmpty(\"Email\", user.getEmail())
    .minLength(\"Password\", user.getPassword(), 6)
    .throwIfInvalid();
