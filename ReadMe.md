## `TC Validation`

- Verifying Turkish citizenship status with the entered information.

### 📑Used packages

[![Java](https://img.shields.io/badge/java-17.0-000?style=for-the-badge&logo=openjdk&logoColor=white&color=FF9A00)](https://www.java.com/en/)
[![Maven](https://img.shields.io/badge/Maven-3.9-000?style=for-the-badge&logo=apache-maven&logoColor=white&color=C71A36)](https://maven.apache.org/)
[![OkHttp](https://img.shields.io/badge/OkHttp-5.0-000?style=for-the-badge&logo=okta&logoColor=white&color=4479A1)](https://square.github.io/okhttp/)
[![KPSPublic](https://img.shields.io/badge/KPSPublic-1.0-000?style=for-the-badge&logo=keenetic&logoColor=white&color=0E3A2F)](https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx)

<br>

### 👍Code example

- import `import org.furkankayam.TCValidation;`

```java
Boolean tcValid = TCValidation.tcValidation(
        "12345678901", // Turkish ID Number
        "mehmet furkan", // First Name
        "kaya", // Last Name
        "2001"); // Year of Birth

System.out.println(tcValid); // true-false
```

<br>

### ✅Releases

- The latest release `maven, gradle` dependencies

#### 🪶Maven

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<!-- https://github.com/furkankayam/tc-validation -->
<dependency>
    <groupId>com.github.furkankayam</groupId>
    <artifactId>tc-validation</artifactId>
    <version>2.0</version>
</dependency>
```

#### 🐘Gradle

```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}

dependencies {
    // https://github.com/furkankayam/tc-validation
    implementation 'com.github.furkankayam:tc-validation:2.0'
}
```

<br>

# 📖License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details
