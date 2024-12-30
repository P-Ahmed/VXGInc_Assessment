# VXG Inc QA Recruitment Assignment

## Assessment documentation:
https://videoexpertsgroup.atlassian.net/wiki/external/NWI1MWZjZWFmNzlkNGVmZDhkMzUwMWQzZDcyMWEyYTI

## Tools & technology used:
- **Test Framework Suite:** Selenium
- **Testing Framework:** TestNG
- **Programming Language:** Java
- **IDE:** IntelliJ IDEA
- **Build tool:** Gradle

## Purpose of choosing Selenium:
- **Web Automation Leader:** Selenium is one of the most widely used frameworks for web automation, providing robust support for multiple browsers and platforms.
- **Cross-Browser Testing:** Supports most modern browsers like Chrome, Firefox, Safari, and Edge.
- **Community and Support:** Extensive community resources, documentation, and active development.
- **Integration-Friendly:** Easily integrates with test frameworks (like TestNG), CI/CD pipelines, and reporting tools.

## Why Selenium over Others?
Compared to tools like Cypress or Playwright, Selenium supports a wider range of browsers and programming languages.
While Cypress and Playwright are better for fast and consistent execution in modern web apps, Selenium is still preferred for legacy systems and varied environments.

## Prerequisite:
1. Need to install **JDK** and configure it into Environment variable
2. Download **Gradle** and configure it into the Environment variable also

## Run the automation script:
1. Open the project with **IntelliJ IDEA** by clicking on **build.gradle**
2. Let the **IntelliJ IDEA** to download the dependencies for the first run
3. After dependencies are downloaded and the project loaded successfully, click on **Terminal** from the bottom left bar
4. Type in the terminal:

```bash
gradle clean test
```
5. Selenium will open the browser and start the automation.
6. To view the report of the automation execution, expand the **build -> reports -> tests** folder and open "index.html" in a browser

## Testcases & bugs:
https://docs.google.com/spreadsheets/d/13sYuB5RFgXBmQufGPStEeprhiDBtLgoFTX-YIKUcPbg/edit?usp=sharing

## Test execution video:
https://drive.google.com/file/d/13PtuM-CU8hzLYG6RXqwtRq-zJIVcxC7c/view?usp=sharing

## Test execution result:
![image](https://github.com/user-attachments/assets/d57640ee-90dc-455c-95fd-37c373e3164c)

## Performance testing result:
![image](https://github.com/user-attachments/assets/0e3abeb7-1527-44c1-84d7-51d4147f8162)
