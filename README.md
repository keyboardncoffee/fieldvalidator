# FieldValidator

**FieldValidator** is a lightweight, fluent Java utility that simplifies input validation across Java and Spring applications. It helps developers enforce rules like `notNull`, `notBlankOrEmpty`, and `minLength` without cluttering their code with repetitive `if` statements and custom exceptions.

> Designed by an engineer, for engineers — because clean input validation shouldn't be a pain.

---

##  Features

- Fluent and chainable validation methods
- Works in both plain Java and Spring projects
- Clear error messages tied to field names
- Zero dependencies — use it anywhere
- Open for extension: easily add more validations

```

```
### Maven
For your maven applications
Add the Jitpack repository and dependency to your pom.xml

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.github.keyboardncoffee</groupId>
    <artifactId>fieldvalidator</artifactId>
    <version>v1.0.1</version>
  </dependency>
</dependencies>

```
### Gradle (Groovy DSL)
For your gradle application built in Java,
add Jitpack to your settings.gradle

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
````
Then add the dependency in your build.gradle

```
dependencies {
    implementation 'com.github.keyboardncoffee:fieldvalidator:v1.0.1'
}

```
### Gradle (Kotlin DSL)
For your gradle application built in Kotlin,
add Jitpack to your settings.gradle.kts

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
```
Then add the dependency in your build.gradle.kts

```
dependencies {
    implementation 'com.github.keyboardncoffee:fieldvalidator:v1.0.1'
}

```

### Example Usage

```java

import static com.keyboardncoffee.fieldvalidator.FieldValidator.*;

public class UserService {
    public void registerUser(String name, String email) {
        check(name, "Name")
            .notNull()
            .notBlankOrEmpty()
            .minLength(3);

        check(email, "Email")
            .notNull()
            .notBlankOrEmpty();
    }
}

```
### Available validation methods

| Method              | Description                            |
| ------------------- | -------------------------------------- |
| `notNull()`         | Ensures the value is not null          |
| `notBlankOrEmpty()` | Ensures a string is not blank or empty |
| `minLength(int)`    | Ensures a string has a minimum length  |


### License

MIT License — https://opensource.org/licenses/MIT

### Contributions
Want to add more validators? Fork the repo, open a PR, or raise an issue.
Community collaboration is encouraged.

### AUTHOR
Built by 

### Tega Isiboge - https://github.com/keyboardncoffee

