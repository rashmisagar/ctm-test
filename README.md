# ctm-test

CTM Tech test project is designed using BDD Cucumber framework and Java with Selenium.

I have considered three test scenarios per feature file to possibly test the full coverage of the online energy product user journey:

1. As an Electricity only user, I should be able to get quotes from companies that provide the products through the online journey, so that I can compare prices to make an optimal decision

2. As a Gas & Electricity user, I should be able to get quotes from companies that provide the products through the online journey, so that I can compare prices to make an optimal decision

3. As a Gas only user, I should be able to get quotes from companies that provide the products through the online journey, so that I can compare prices to make an optimal decision

I have developed a feature file for Electricity only Compare Test with three test scenarios for the three pages with Electricity only compare user journey.

I used Electricity Only compare Users of the website and their interactions in the user journey.

*******************************************************************************************
Tools & libraries used
*******************************************************************************************
The test automation framework is comprised of following tools and libraries

*Cucumber-JVM:- BDD Framework
*Custom Page Object Pattern and utility functions
*Selenium WebDriver: - Browser automation framework
*JAVA: - Programming language
*Junit: - Junit Java testing framework
*Maven: - Build tool
*PicoContainer: - Standard Dependency Injection
*Git OR SVN: - Version Control

*******************************************************************************************
Test Execution
*******************************************************************************************
This is a Java project so a latest JDK is required to be installed to run the tess.
Most preferably it can be run in an IDE that supports java for e.g., IntelliJ IDEA or Eclipse.
The project's dependencies and required plugins are mentioned in pom.xml maven file.
The tests can be run through TestRunner.java file under ctm-test/src/test/java/runner/.
Please save the zip file to your local machine and open in the IDE.
If you want to run as Maven, you can convert the project to Maven and run through command prompt. The Maven dependencies are in pom.xml file

It uses the feature file under ctm-test\src\test\java\Feature

and steps files under ctm-test\src\test\java\steps

Report can be seen generated under target/site/cucumber-pretty

The tests uses chromedriver to run the tests so it checks and copies to a local folder before executing the tests.
or try to install chromedriver.exe under user.home") + "/Google/Chrome/Driver/chromedriver.exe



