# selenium-web-tests

### Installation:

1. Clone the project.
2. Open the project using [Eclipse](https://www.eclipse.org/downloads/packages/release/2022-09/r/eclipse-ide-java-developers) or any IDE of your choice.
3. Now, go to the terminal and run `mvn clean && mvn install`.<br>

### How To Run Tests?

- To run tests, <br>
        * `mvn test -Dsurefire.suiteXmlFiles=testng.xml` - run tests locally. <br>
        * `mvn clean test && allure serve` - generates the allure report. <br> 
        (Note: Make sure allure is configured in your system's env variable. Otherwise, it will return an error `'allure' is not recognized as an internal or external command`)
