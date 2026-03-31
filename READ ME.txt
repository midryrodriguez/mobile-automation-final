Mobile Automation Final Project

Overview

This project automates key functional scenarios of a native Android mobile application using Java, Maven, Appium, Android, and TestNG.

The framework was built following automation best practices, with focus on:
- Page Object Model (POM)
- test independence
- dynamic test data
- explicit waits
- reusable components
- maintainability and robustness

The automated scenarios cover bottom navigation, user sign up, user login, and swipe interactions.

Objective

Consolidate the knowledge acquired in mobile automation using Maven, Android, Appium, and TestNG by designing, implementing, and executing automated tests on a native Android application.

Tech Stack

- Java 17
- Maven
- Appium Java Client 9.5.0
- Selenium 4.33.0
- TestNG 7.11.0
- Android Studio Emulator
- Appium Server
- IntelliJ IDEA

Project Structure

src
 └─ test
    ├─ java
    │  ├─ base
    │  │  ├─ BaseTest.java
    │  │  └─ DriverManager.java
    │  ├─ models
    │  │  └─ User.java
    │  ├─ pages
    │  │  ├─ BasePage.java
    │  │  ├─ HomePage.java
    │  │  ├─ LoginPage.java
    │  │  ├─ NavigationBar.java
    │  │  └─ SwipePage.java
    │  ├─ tests
    │  │  ├─ BottomNavigationFullTest.java
    │  │  ├─ HomeNavigationTest.java
    │  │  ├─ LaunchAppTest.java
    │  │  ├─ LoginNavigationTest.java
    │  │  ├─ LoginTest.java
    │  │  ├─ SignUpTest.java
    │  │  ├─ SwipeCardsTest.java
    │  │  ├─ SwipeNavigationTest.java
    │  │  └─ UserDataGeneratorTest.java
    │  └─ utils
    │     ├─ GestureUtils.java
    │     └─ UserDataGenerator.java
    └─ resources
       ├─ config.properties
       └─ testng.xml

Automated Scenarios

1. Bottom Navigation Bar
Validates navigation through the main bottom tabs and confirms that each screen loads correctly.

2. Successful Sign Up
Automates the sign-up flow using dynamically generated user data.

3. Successful Login
Creates a new user dynamically, signs up in the same test flow, and then logs in with that same user.

4. Swipe Cards
Automates horizontal card swiping and vertical scrolling.

Framework Design

Page Object Model
UI interactions are separated from test logic through page classes.

Dynamic Test Data
Uses a generator to create unique users for each execution.

Gestures
Implements W3C Actions for swipe handling.

Prerequisites

- Java 17
- Maven
- Appium Server
- Android Studio
- Emulator or physical device

Configuration

platformName=Android
automationName=UiAutomator2
deviceName=Pixel 6
appPath=C:/Apps/android.wdio.native.app.v2.2.0.apk
appiumServerUrl=http://127.0.0.1:4723

How to Run

Start Appium:
appium

Run tests:
mvn test

Run single test:
mvn -Dtest=LoginTest test

Best Practices Applied

- POM
- explicit waits
- dynamic data
- reusable components
- independent tests
