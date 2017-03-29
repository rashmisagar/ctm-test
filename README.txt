README

*****************
Test Design
*****************
CTM Tech test project is designed using BDD Cucumber framework and Java with Selenium

I have considered three test scenarios per feature file to possibly test the full coverage of the online energy product user journey:
1. As an Electricity only user, I should be able to get quotes from companies that provide the products through the online journey, so that I can compare prices to make an optimal decision

2. As a Gas & Electricity user, I should be able to get quotes from companies that provide the products through the online journey, so that I can compare prices to make an optimal decision

3. As a Gas only user, I should be able to get quotes from companies that provide the products through the online journey, so that I can compare prices to make an optimal decision

I have developed a feature file for Electricity only Compare Test with three test scenarios for the three pages with Electricity only compare user journey.

I used Electricity Only compare Users of the website and their interactions in the user journey.

*******************
Test Execution
*******************
The project's dependencies and required plugins are mentioned in pom.xml maven file
The tests can be run through the TestRunner.java file under CTMTechTest\src\test\java\runner
Please save the zip file to your local machine and open in any IDE that supports java for e.g., IntelliJ IDEA or Eclipse.
If you want to run as Maven, you can convert the project to Maven or run through command prompt. The Maven dependencies are in pom.xml file

It uses the feature file under CTMTechTest\src\test\java\Feature

and steps files under CTMTechTest\src\test\java\steps

Report can be seen generated under target/site/cucumber-pretty

The tests uses chromedriver to run the tests so it checks and copies to a local folder before executing the tests.
or try to install chromedriver.exe under user.home") + "/Google/Chrome/Driver/chromedriver.exe

i was working on setting up different browsers to run the tests on which is further an enhancement

*********************

Further enhancements
*********************
Though there are a lot of tests possible to do while going through testing the journey, but I have developed tests for Elecricity only comparison using BDD.
The further enhancement to be to get Page objects or mock objects into theframework but wasn't done due to time shortage.
As a note, these tests could further be enhanced in a lot of different ways.


