1. [Selenium](#selenium "About selenium")
1. [Selenium Components](#selenium-components "Selenium Components")
    1. [Selenium WebDriver](#selenium-webdriver)
    1. [Selenium IDE](#selenium-ide-integrated-development-environment)
    1. [Selenium Grid](#selenium-grid)

# Automation-Java-Selenium
Web Automation using java and selenium

# Selenium
Selenium is a powerful suite of tools used for automating web browsers.
It supports multiple programming languages, browsers, and platforms. 
The Selenium suite consists of several key components, each designed for specific use cases.

## Selenium Components

### Selenium WebDriver
Purpose: Automates web browser interactions by simulating user actions such as clicking, typing, and navigating.

- **Features:**
- Supports multiple browsers: Chrome, Firefox, Edge, Safari, etc.
- Provides APIs for multiple programming languages: Java, Python, C#, JavaScript, and more.
- Supports headless browser automation (running without a graphical interface).
- Allows direct communication with browsers through browser drivers like ChromeDriver, GeckoDriver, etc.

### Selenium IDE (Integrated Development Environment)
Purpose: A browser extension used for recording, editing, and debugging Selenium test cases.

- **Features:**
- Easy-to-use record and playback functionality.
- Available as a plugin for Chrome and Firefox.
- Exports recorded test cases to code in various languages (Java, Python, etc.).
- Supports basic assertions, loops, and conditionals.
- Ideal for beginners and quick automation tasks.
- Use Case: Quick prototyping of test cases or automating simple tasks without writing code.

### Selenium Grid
Purpose: Enables distributed test execution by running tests across multiple machines, browsers, and operating systems concurrently.

- **Features:**

- Supports parallel execution of test cases.
- Centralized hub architecture where a Hub coordinates execution across multiple Nodes.
- Useful for cross-browser and cross-platform testing.
- Reduces execution time significantly for large test suites.
Architecture:

- **Hub:** The central server where test requests are sent.
- **Node:** Remote machines executing the tests.

## Terminology
`API:` Application Programming Interface. This is the set of “commands” you use to manipulate WebDriver.

> [!TIP]
> SearchContext is the root/partent interface

`Library:` A code module that contains the APIs and the code necessary to implement them. Libraries are specific to each language binding, eg .jar files for Java, .dll files for .NET, etc.
`Driver:` Responsible for controlling the actual browser. Most drivers are created by the browser vendors themselves. Drivers are generally executable modules that run on the system with the browser itself, not the system executing the test suite. (Although those may be the same system.) NOTE: Some people refer to the drivers as proxies.

> [!TIP]
> WebDriver is the parent interface for `ChromeDriver`, `FirefoxDriver` `EdgeDriver` and more.

`Framework:` An additional library that is used as a support for WebDriver suites. These frameworks may be test frameworks such as JUnit or NUnit. They may also be frameworks supporting natural language features such as Cucumber or Robotium. Frameworks may also be written and used for tasks such as manipulating or configuring the system under test, data creation, test oracles, etc.

> [!TIP]
> `Hybrid-POM`(Page Object Model), `Data Driven`, `Keyword Driven`, `BDD/TDD` are some examples of Automation Frameworks.

# WebDriver in Selenium
Selenium WebDriver is a core component of the Selenium suite that allows you to automate web browser interactions programmatically. It provides an object-oriented API for controlling various web browsers and simulates user actions such as clicking buttons, filling out forms, and navigating between pages.
Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.

>[!TIP]
> Selenium WebDriver is a `W3C Recommendation`
> WebDriver supports multiple programming languages, browsers, and operating systems, making it one of the most versatile tools for browser automation.
