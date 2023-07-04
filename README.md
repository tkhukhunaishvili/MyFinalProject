# MyFinalProject
final project
Final project of Testing automation course 

The project is about testing various functionalities of a commercial website. The mentioned project is organized with a POM structure and includes two classes of test cases 

 

Prerequisites 

Before running the tests, ensure that you have the following installed: 

Java Development Kit (JDK) 

TestNG framework 

Selenium WebDriver 

ChromeDriver 

 

The project includes the following test classes: LogIN and Search Test clases 

 

Search Test  Class and Log IN Class 

 

The LogIn class contains multiple test methods for different login scenarios. Each test method is annotated with @Test and includes the necessary steps to perform the login process with specific data. 

The available test methods are as follows: 

logInWithIncorrectData: Tests the login process with incorrect email and password. 

LogInWithIncorrectData1: Tests the login process with correct email and incorrect password. 

LogInWithIncorrectData5: Tests the login process with incorrect email and correct password. 

LogInWithIncorrectData0: Tests the login process with incorrect email and empty password. 

LogInWithEmptyData9: Tests the login process with empty email and empty password. 

LogInWithCorrectData: Tests the login process with correct email and password. 

This repository contains test cases for the search functionality of a web application. The tests are written in Java using TestNG and Selenium WebDriver. The purpose of these tests is to verify the behavior of the search functionality with different keyword inputs. 

 

Test Cases 

searchWithEmptyKeyword: This test case verifies the behavior of searching with an empty keyword. It opens the web application, enters an empty keyword in the search field, and presses Enter. After a short delay, the test closes the browser. 

searchWithInvalidKeyword: This test case checks the behavior of searching with an invalid keyword. It performs similar steps as the previous test case and includes a soft assertion to compare the actual title of the page with the expected title. Additionally, it prints a message indicating whether the search results are correct or not. 

searchWithValidKeyword: This test case tests the behavior of searching with a valid keyword. It follows the same steps as the previous test cases and waits for a short delay before closing the browser. 

searchWithValidKeyword2: This test case examines the scenario of searching with a valid keyword. It performs similar steps as the previous test case without the additional delay. 

 

Test Reports 

The test reports  generated using the Allure reporting framework. The reports provide detailed information about the test execution, including the test case descriptions, steps, and assertions. You can view the reports by running the following command in the project directory. 

 
