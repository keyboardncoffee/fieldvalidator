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


```xml
<dependencies>
    <dependency>
        <groupId>com.keyboardncoffee</groupId>
        <artifactId>fieldvalidator</artifactId>
        <version>1.0.7</version>
    </dependency>
</dependencies>


```
### Gradle (Groov DSL)

```xml
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/keyboardncoffee/fieldvalidator")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("GITHUB_TOKEN")
        }
    }
    mavenCentral() // or your custom repo
}

dependencies {
    implementation 'com.keyboardncoffee:fieldvalidator:1.0.7'
}


```

### Gradle (Kotlin DSL)
```xml
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.keyboardncoffee:fieldvalidator:1.0.7")
}



### Tip: Add credentials in ~/.gradle/gradle.properties

```xml
gpr.user=your_github_username  
gpr.key=your_github_token

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
### License

MIT License — https://opensource.org/licenses/MIT

### AUTHOR
Tega Isiboge

isibogetega@gmail.com

https://github.com/keyboardncoffee

