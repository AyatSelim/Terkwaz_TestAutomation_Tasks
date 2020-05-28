# Terkwaz_TestAutomation_Tasks

Getting Started:
These instructions will get you a copy of the project up and running on your local machine for  testing purposes. 

Prerequisites & Installation:

IDE: 
-Eclipse _ [Download Eclipse](https://www.eclipse.org/downloads/packages/release/2019-12/r)

Technology : 
-Java _ [Install Java SE_13](https://www.oracle.com/java/technologies/javase-downloads.html) 
-Selenium _ [Download Selenium WebDriver JAR Files and Add them](https://www.selenium.dev/downloads/)
-Maven _ [Install lastest M2Eclipse](http://download.eclipse.org/technology/m2e/releases)
-TestNG _ [Add TestNG dependency to POM.XML File](https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html)

Additional components:
-ChromeDriver_ [Check that the version is compatible with your browser if no download the right one and replace it with the existing one] (https://chromedriver.chromium.org/downloads)

Tests:
Are designed as the following :
-Test:
--RestAssuredTask >
---API_Test_Automation.java //class for Api Test Case , To be run as TestNG
--SeleniumTasks > 
---Task1_ValidateText_TC_Run.java //Class to  TestCase in Task1 , To be run as TestNG
---Task2_UploadFile_TC_Run.java //Class for the TestCase in Task2 , To be run as TestNG
---Task3_DynamicLoad_TC_Run.java //Class for the TestCase in Task2 , To be run as TestNG

How to use:
-Run Test Cases :
1-Right click on the Project 
2-Choose RunAs TestNG
-Get Test Report :
1-Go to test-output
2-Right click on "index.html"
3-Choose Open With "Web Browser"
4-Check Test results and ScreenShots

API Reference:("https://alexwohlbruck.github.io/cat-facts/")
