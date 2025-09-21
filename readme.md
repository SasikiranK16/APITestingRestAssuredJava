<!-- PROFILE BADGES -->
<!-- You can generate these at https://shields.io/ and https://simpleicons.org/ -->
<div align="center">

# 🧪 Advanced API Automation Framework

[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org/)
[![TestNG](https://img.shields.io/badge/TestNG-%23FF6A00?style=for-the-badge)](https://testng.org/)
[![Rest-Assured](https://img.shields.io/badge/-Rest%20Assured-%23D00000?style=for-the-badge)](https://rest-assured.io/)
[![Allure Report](https://img.shields.io/badge/Allure%20Reports-%23E6B3B3?style=for-the-badge)](https://qameta.io/allure-report/)
[![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)](https://github.com/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)

*A robust, scalable, and professional test automation framework built for modern API testing.*

</div>

---

## ✨ Features & Highlights

| Area | Technologies |
| :--- | :--- |
| **Core Language** | Java 25 |
| **Build Tool** | Apache Maven |
| **Testing Framework** | TestNG |
| **API Testing** | REST Assured |
| **Assertions** | REST Assured Matchers, Hamcrest |
| **Reports** | **Allure Report** (Interactive & Detailed), Extent Reports (Customizable) |
| **Design Pattern** | Page Object Model (POM) for APIs, Builder Pattern for Request Creation |
| **Logging** | Log4j2 / SLF4J |
| **CI/CD Ready** | Seamless integration with Jenkins, GitHub Actions |

---

## 📁 Project Structure

```bash
src/test/java/
│
├── 📂 api
│   ├── 📂 clients          # API Client classes (e.g., UserClient, ProductClient)
│   └── 📂 payloads         # Request and Response POJOs (Plain Old Java Objects)
│
├── 📂 core
│   ├── 📂 config           # Framework configuration (e.g., BaseTest, RequestSpecs)
│   ├── 📂 listeners        # TestNG listeners for reporting
│   ├── 📂 utils            # Reusable utilities (e.g., Data Generator, File Reader)
│   └── 📂 constants        # Global constants
│
├── 📂 tests                # All TestNG test classes
│   └── UserAPITests.java
│   └── ProductAPITests.java
│
└── 📂 resources
    ├── 📂 testdata         # Test data files (JSON, XML, CSV)
    ├── config.properties   # Environment configuration
    ├── log4j2.xml          # Logging configuration
    └── suite.xml           # TestNG suite XML file

target/
└── allure-results          # Allure results (generated after test execution)
