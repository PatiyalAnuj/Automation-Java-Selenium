1. [Selenium](#selenium "About selenium")
1. [Selenium Components](#selenium-components "Selenium Components")
    1. [Selenium WebDriver](#selenium-webdriver)
    1. [Selenium IDE](#selenium-ide-integrated-development-environment)
    1. [Selenium Grid](#selenium-grid)
    1. [Selenium Server](#selenium-server)
    1. [Selenium Manager](#selenium-manager)

# Automation-Java-Selenium
Web Automation using java and selenium

# Selenium
Selenium is a powerful suite of tools used for automating web browsers.
It supports multiple programming languages, browsers, and platforms. 
The Selenium suite consists of several key components, each designed for specific use cases.

## Selenium Components

### Selenium WebDriver
Purpose: Automates web browser interactions by simulating user actions such as clicking, typing, and navigating.

**Features:**
- Supports multiple browsers: Chrome, Firefox, Edge, Safari, etc.
- Provides APIs for multiple programming languages: Java, Python, C#, JavaScript, and more.
- Supports headless browser automation (running without a graphical interface).
- Allows direct communication with browsers through browser drivers like ChromeDriver, GeckoDriver, etc.

### Selenium IDE (Integrated Development Environment)
Purpose: A browser extension used for recording, editing, and debugging Selenium test cases.

**Features:**
- Easy-to-use record and playback functionality.
- Available as a plugin for Chrome and Firefox.
- Exports recorded test cases to code in various languages (Java, Python, etc.).
- Supports basic assertions, loops, and conditionals.
- Ideal for beginners and quick automation tasks.
- Use Case: Quick prototyping of test cases or automating simple tasks without writing code.

### Selenium Grid
Purpose: Enables distributed test execution by running tests across multiple machines, browsers, and operating systems concurrently.

**Features:**
- Supports parallel execution of test cases.
- Centralized hub architecture where a Hub coordinates execution across multiple Nodes.
- Useful for cross-browser and cross-platform testing.
- Reduces execution time significantly for large test suites.
Architecture:

**Hub:** The central server where test requests are sent.

**Node:** Remote machines executing the tests.

### Selenium Server
Purpose: Acts as an intermediary between the test scripts and browser drivers, enabling remote execution and communication with different browsers.

**Uses:**
- Required for Selenium Grid setups.
- Supports running WebDriver tests remotely on different machines.
- Download:
The server can be downloaded from Selenium’s official website.

### Selenium Manager
Purpose: A tool introduced in Selenium 4.6 to automatically manage browser drivers for WebDriver tests.

**Features:**
- No need to manually download and manage `ChromeDriver`, `GeckoDriver`, etc.
- Automatically downloads and configures the appropriate driver based on the browser version.
- Simplifies the setup process.


## Terminology
- `API:` Application Programming Interface. This is the set of “commands” you use to manipulate WebDriver.

> [!TIP]
> SearchContext is the root/partent interface

- `Library:` A code module that contains the APIs and the code necessary to implement them. Libraries are specific to each language binding, eg .jar files for Java, .dll files for .NET, etc.

- `Driver:` Responsible for controlling the actual browser. Most drivers are created by the browser vendors themselves. Drivers are generally executable modules that run on the system with the browser itself, not the system executing the test suite. (Although those may be the same system.) NOTE: Some people refer to the drivers as proxies.

> [!TIP]
> WebDriver is the parent interface for `ChromeDriver`, `FirefoxDriver` `EdgeDriver` and more.

- `Framework:` An additional library that is used as a support for WebDriver suites. These frameworks may be test frameworks such as JUnit or NUnit. They may also be frameworks supporting natural language features such as Cucumber or Robotium. Frameworks may also be written and used for tasks such as manipulating or configuring the system under test, data creation, test oracles, etc.

> [!TIP]
> `Hybrid-POM`(Page Object Model), `Data Driven`, `Keyword Driven`, `BDD/TDD` are some examples of Automation Frameworks.

## WebDriver in Selenium
Selenium WebDriver is a core component of the Selenium suite that allows you to automate web browser interactions programmatically. It provides an object-oriented API for controlling various web browsers and simulates user actions such as clicking buttons, filling out forms, and navigating between pages.
Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.

>[!TIP]
> Selenium WebDriver is a `W3C Recommendation`.

> WebDriver supports multiple programming languages, browsers, and operating systems, making it one of the most versatile tools for browser automation.

## Key Features of WebDriver
- **Cross-Browser Support:**
    Works with popular browsers like `Chrome`, `Firefox`, `Edge`, `Safari`, and more.
-  **Multi-Language Support:**
    APIs available for languages such as `Java`, `Python`, `C#`, `Ruby`, `JavaScript`, `etc`.
-  **Headless Execution:**
    Supports running browsers in headless mode (without a graphical interface) for faster test execution.
-  **Synchronization:**
    Provides explicit and implicit waits for handling dynamic web elements.
-  **Parallel Execution:**
    Can be used with Selenium Grid for running tests concurrently on multiple browsers and machines.
-  **Direct Communication with the Browser:**
    Unlike Selenium RC, WebDriver communicates directly with the browser using browser-specific drivers (e.g., `ChromeDriver`, `GeckoDriver`).

## Basic Components of WebDriver
-  WebDriver Interface:
    The main interface that represents a browser session and provides methods for browser interactions.
- Browser Drivers:
    Browser-specific executables that facilitate communication between WebDriver and the browser.

`Examples:`
    - `ChromeDriver` for Google Chrome
    - `GeckoDriver` for Mozilla Firefox
    - `EdgeDriver` for Microsoft Edge
    - `SafariDriver` for Apple Safari

- WebElements:
    Elements on a webpage (e.g., buttons, links, input fields) that WebDriver can interact with.
- By Class:
    Used to locate elements on a webpage using different strategies (e.g., id, name, xpath, cssSelector).


## Common Methods in WebDriver
| Method | Description |
| ------ | ----------- |
| `get(String url)` | Opens the specified URL in the browser. |
| `findElement(By locator)` | Finds the first element matching the locator. |
| `findElements(By locator)` | Finds all elements matching the locator. |
| `getTitle()` | Returns the title of the current page. |
| `getCurrentUrl()` | Returns the URL of the current page. |
| `navigate().to(String url)` | Navigates to the specified URL. |
| `navigate().back()` | Navigates back in the browser history. |
| `navigate().forward()` | Navigates forward in the browser history. |
| `navigate().refresh()` | Refreshes the current page. |
| `close()` | Closes the current browser window. |
| `quit()` | Closes all browser windows and ends the session. |
---

## Common Locators in By Class
| Locator |	Example | Description |
| ------- | ------- | ----------- |
| `By.id` | *By.id("username")* | Locate by element ID. |
| `By.name`  | *By.name("email")* | Locate by element name. |
| `By.className` | *By.className("btn-primary")* | Locate by class name. |
| `By.tagName` | *By.tagName("h1")* | Locate by HTML tag name. |
| `By.linkText` | *By.linkText("Click Here")* | Locate by exact link text. |
| `By.partialLinkText` | *By.partialLinkText("Click")* | Locate by partial link text. |
| `By.cssSelector` | *By.cssSelector(".container > div")* | Locate by CSS selector. |
| `By.xpath` | *By.xpath("//div[@id='main']")* | Locate by XPath expression. |
---

## Common WebDriver Exceptions
- `NoSuchElementException:` Element not found.
- `TimeoutException:` Operation timed out.
- `ElementNotInteractableException:` Element cannot be interacted with.
- `StaleElementReferenceException:` Element is no longer attached to the DOM.
- `WebDriverException` General WebDriver error.

## Best Practices for Using WebDriver
- Use Explicit Waits instead of Thread.sleep to handle dynamic content.
- Always quit the browser using driver.quit() to close all browser windows.
- Keep browser drivers updated to match your browser version.
- Handle exceptions gracefully to make your scripts robust.
- Use Page Object Model (POM) for better test maintenance and readability.
