# A simple Field Validator

A fluent, expressive validation library for Spring Boot and Java applications.

## Quick Example

```java
FieldValidator.validate()
    .notEmpty(\"Email\", user.getEmail())
    .minLength(\"Password\", user.getPassword(), 6)
    .throwIfInvalid();

## 📦 Installation via GitHub Packages

Add to your `pom.xml`:

```xml
<dependency>
  <groupId>com.keyboardncoffee</groupId>
  <artifactId>fieldvalidator</artifactId>
  <version>1.0.0</version>
</dependency>
