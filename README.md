Cucumber Selenium Demo Project
This is a sample project demonstrating the integration of Cucumber, Selenium, and Allure for behavior-driven test automation. The project uses PicoContainer for dependency injection and Maven for build management.
A Behavior-Driven Development (BDD) framework using **Cucumber**, **Selenium**, and **Allure Reports**.

## **Table of Contents**
1. [Overview](#overview)
2. [Features](#features)
3. [Prerequisites](#prerequisites)
4. [Setup](#setup)
5. [Usage](#usage)
6. [Project Structure](#project-structure)
7. [Generating Reports](#generating-reports)
8. [Technologies Used](#technologies-used)
9. [Troubleshooting](#troubleshooting)

---

## **Overview**
This project is designed to automate web-based applications using Selenium WebDriver and to leverage Cucumber for BDD-style test creation. Allure is used to generate insightful and interactive test reports.

---

## **Features**
- BDD with Cucumber.
- Selenium WebDriver for browser automation.
- Configurable through `pom.xml`.
- Allure Reporting for interactive test reports.
- Support for multiple browsers.
- Easy-to-maintain page object structure.

---

## **Prerequisites**
Before you start, ensure you have the following installed:

- **Java** (JDK 8 or later)
- **Maven** (Latest version)
- **Allure Command-Line Tool**:
  - [Download Allure](https://docs.qameta.io/allure/#_get_started)
- **Browser Drivers**:
  - Download the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) and ensure it's in your system PATH.

---

## **Setup**

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. **Install Dependencies**:
   Run the following command to download all dependencies specified in `pom.xml`:
   ```bash
   mvn clean install
   ```

3. **Configure Test Data**:
   Update configuration files (e.g., `src/test/resources/config.properties`) with appropriate values like browser type, base URL, etc.

---

## **Usage**

### **Running Tests**
Run the tests using Maven:
```bash
mvn clean test
```

### **Run Specific Scenarios**
To run a specific feature file or tag, use:
```bash
mvn clean test -Dcucumber.filter.tags="@YourTag"
```

---

## **Project Structure**
```plaintext
<Your Project Name>
├── pom.xml                      # Maven configuration file
├── src
│   ├── main
│   │   ├── java
│   │   │   └── <Application Code>  # (Optional if needed)
│   ├── test
│   │   ├── java
│   │   │   ├── steps             # Step definition files
│   │   │   ├── hooks             # Hooks (before/after scenario setup)
│   │   │   └── runners           # Test runners
│   │   ├── resources
│   │   │   ├── features          # Cucumber feature files
│   │   │   └── config.properties # Configurations
│   │   └── allure-results        # Test results for Allure reports
└── README.md
```

---

## **Generating Reports**

### **Allure Report**

1. **Run Tests**:
   Execute tests to generate the `allure-results` directory:
   ```bash
   mvn clean test
   ```

2. **Serve the Report**:
   Use the Allure command-line tool to serve the report:
   ```bash
   allure serve target/allure-results
   ```

   This will open the Allure report in your default web browser.

3. Generate a Static Report:
   ```bash
   allure generate target/allure-results --clean -o target/allure-report
   ```

---

## Technologies Used

- **Java**: Programming language for writing test scripts.
- **Cucumber**: BDD framework for defining test cases in Gherkin.
- **Selenium**: Web automation tool for browser testing.
- **Maven**: Build automation tool.
- **Allure**: Reporting framework for interactive reports.


## Troubleshooting

### Common Issues
1. Maven Not Recognized:
   Ensure `mvn` is in your system PATH. Verify by running `mvn -v`.

2. Allure Results Directory Missing:
   Make sure your tests generate results in `target/allure-results`.

3. WebDriver Issues:
   Ensure the correct WebDriver (e.g., ChromeDriver) is downloaded and available in your PATH.


##Contributing

1. Fork the repository.
2. Create a new feature branch: `git checkout -b feature/my-feature`.
3. Commit your changes: `git commit -m 'Add feature'`.
4. Push to the branch: `git push origin feature/my-feature`.
5. Submit a pull request.
## License

This project is licensed under the MIT License.


