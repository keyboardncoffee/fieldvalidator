# FieldValidator

**FieldValidator** is a lightweight, fluent validation library for simplifying user input checks in Java applications. It helps you eliminate repetitive `if` statements and makes validations more expressive and readable.

---

## Installation

Available via **GitHub Packages**. Add it using **Maven** or **Gradle**:

### ✅ Maven

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/keyboardncoffee/fieldvalidator</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.keyboardncoffee</groupId>
    <artifactId>fieldvalidator</artifactId>
    <version>1.0.7</version>
  </dependency>
</dependencies>

```
### Gradle

```xml
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/keyboardncoffee/fieldvalidator")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation 'com.keyboardncoffee:fieldvalidator:1.0.7'
}

```

### Tip: Add credentials in ~/.gradle/gradle.properties

```xml
gpr.user=your_github_username  
gpr.key=your_github_token

```

### Usage Example

``` java
FieldValidator.check()
    .field("email", user.getEmail()).notBlank().isEmail()
    .field("age", user.getAge()).greaterThan(17)
    .validate(); // Throws ValidationException if any rule fails


```
### License

MIT License — https://opensource.org/licenses/MIT

### AUTHOR
Tega Isiboge

isibogetega@gmail.com

https://github.com/keyboardncoffee

