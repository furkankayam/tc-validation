## `TC Validation`

- Verifying Turkish citizenship status with the entered information.

### 📑Used packages

[![Java](https://img.shields.io/badge/java-17.0-000?style=for-the-badge&logo=openjdk&logoColor=white&color=FF9A00)](https://www.java.com/en/)
[![Maven](https://img.shields.io/badge/Maven-3.9-000?style=for-the-badge&logo=apache-maven&logoColor=white&color=C71A36)](https://maven.apache.org/)
[![OkHttp](https://img.shields.io/badge/OkHttp-4.10-000?style=for-the-badge&logo=okta&logoColor=white&color=4479A1)](https://square.github.io/okhttp/)
[![KPSPublic](https://img.shields.io/badge/KPSPublic-1.0-000?style=for-the-badge&logo=keenetic&logoColor=white&color=0E3A2F)](https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx)

<br>

### 👍Code example

```java
import org.furkankayam.TCValidation;

Boolean tcValid = TCValidation.tcValidation(
        "12345678901",
        "firstName",
        "lastName",
        "2001");

System.out.

println(tcValid);
```

### ✅Releases

- The latest release `maven` dependency

```xml
<dependency>
    <groupId>org.furkankayam</groupId>
    <artifactId>tc-validation</artifactId>
    <version>1.0</version>
</dependency>
```

- `mvn install`

<br>

# 📖License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details