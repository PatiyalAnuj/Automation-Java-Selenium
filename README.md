# Automation-Java-Selenium
Web Automation using java and selenium

1. [Selenium](#selenium "About selenium")
    1. [Selenium Components](#selenium-components "Selenium Components")
        1. [Selenium WebDriver](#selenium-webdriver)
        1. [Selenium IDE](#selenium-ide-integrated-development-environment)
        1. [Selenium Grid](#selenium-grid)
        1. [Selenium Server](#selenium-server)
        1. [Selenium Manager](#selenium-manager)
1. [Selenium Basics](#webdriver-in-selenium)
    1. [WebDriver Terminology](#terminology)
    1. [Key Features of WebDriver](#key-features-of-webdriver)
    1. [Basic Components of WebDriver](#basic-components-of-webdriver)
    1. [Common Methods in WebDriver](#common-methods-in-webdriver)
    1. [Common Locators in By Class](#common-locators-in-by-class)
    1. [Common WebDriver Exceptions](#common-webdriver-exceptions)
    1. [Best Practices for Using WebDriver](#best-practices-for-using-webdriver)
1. [Locators in Selenium](./src/test/java/locators/Locators.md)


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

# WebDriver in Selenium
Selenium WebDriver is a core component of the Selenium suite that allows you to automate web browser interactions programmatically. It provides an object-oriented API for controlling various web browsers and simulates user actions such as clicking buttons, filling out forms, and navigating between pages.
Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.

>[!TIP]
> Selenium WebDriver is a `W3C Recommendation`.

> WebDriver supports multiple programming languages, browsers, and operating systems, making it one of the most versatile tools for browser automation.

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

#  Locators in Selenium
In Selenium, locators are the methods or strategies used to identify and interact with elements on a webpage. Locators are essential for automating web interactions because they allow Selenium to find and act upon elements like *buttons*, *links*, *text fields*, *checkboxes*, etc. Below is a detailed guide on the different types of locators and how they can be used effectively.

## ID Locator
The `ID` is one of the most common and efficient ways to locate an element on a page because it is unique for each element.
    - **Syntax:** `By.id("elementId")`

`Example:`
```Java
WebElement element = driver.findElement(By.id("submitBtn"));
``` 
- **Pros:** Fast and reliable (ID is unique for most elements).
- **Cons:** Only works if the element has a unique id attribute.

## Name Locator
This locator identifies elements by their name attribute.

- **Syntax:** `By.name("elementName")`
`Example:`

```java
WebElement element = driver.findElement(By.name("username"));
```
- **Pros:** Useful when elements don't have unique IDs but have a name attribute.
- **Cons:** The name attribute may not always be unique.

## Class Name Locator
Locates elements by their CSS class name. This is effective if multiple elements have the same class.

- **Syntax:** `By.className("className")`
`Example:`

```java
WebElement element = driver.findElement(By.className("submit-button"));
```
- **Pros:** Easy to use when multiple elements share a class.
- **Cons:** Can be slow if the class is too general or shared across many elements.

## Tag Name Locator
Locates elements by their HTML tag name (e.g., div, button, input).

- **Syntax:** `By.tagName("tagName")`
`Example:`

```java
WebElement element = driver.findElement(By.tagName("button"));
```
- **Pros:** Good for locating elements that don't have specific attributes.
- **Cons:** Not specific enough for complex pages, as multiple elements can share the same tag.

## Link Text Locator
Used for locating hyperlinks (`<a>` tags) based on their exact link text.

- **Syntax:** `By.linkText("exactLinkText")`

`Example:`

```java
WebElement element = driver.findElement(By.linkText("Click Here"));
```
- **Pros:** Reliable for links with clear, unique text.
- **Cons:** Doesn't work if the link text changes or is dynamic.

## Partial Link Text Locator
This is similar to linkText, but allows you to match a partial text of a link.

- **Syntax:** `By.partialLinkText("partialLinkText")`

`Example:`

```java
WebElement element = driver.findElement(By.partialLinkText("Click"));
```
- **Pros:** Useful when the link text is too long or dynamic.
- **Cons:** The partial text should be unique enough to identify the link.

## CSS Selector Locator
The CSS selector is a powerful and flexible way to locate elements by targeting attributes, classes, IDs, and other attributes. It uses CSS syntax.

- **Syntax:** `By.cssSelector("cssSelector")`

`Example:`

```java
WebElement element = driver.findElement(By.cssSelector(".submit-button"));
```
CSS selectors can be very specific, and you can use attributes, class names, or even the position of an element.

- Basic CSS selectors:
    - Select by class: `.className`
    - Select by ID: `#elementId`
    - Select by attribute: `[attribute='value']`
    - Select by tag name: `tagName`

`Example:`

```java
WebElement element = driver.findElement(By.cssSelector("div.container > button"));
```
- **Pros:** Flexible, allows complex querying.
- **Cons:** Can be complex for complicated structures.

## XPath Locator
XPath is a powerful query language for selecting elements based on the structure of the XML/HTML document. XPath can locate elements by attributes, text content, or hierarchical structure.

- **Syntax:** `By.xpath("xpathExpression")`

`Examples:`

```java
WebElement element = driver.findElement(By.xpath("//button[@id='submitBtn']"));
```
- XPath can be used to select elements using:
    **Attributes:** `//tag[@attribute='value']`
    **Text content:** `//tag[text()='text']`
    **Partial Text:** `//tag[contains(text(),'partial text')]`
    **Hierarchy:** `//parent/child/grandchild`

`Example:`

```java
WebElement element = driver.findElement(By.xpath("//div[@class='header']//button[text()='Click']"));
```
- **Pros:** Very flexible, can navigate complex DOM structures, select based on text, attributes, or position.
- **Cons:** Slower than CSS selectors in many cases. Can become complex and hard to maintain.
 
# Other Advanced Locator Strategies
## Relative XPath
This allows you to find elements based on a path relative to another known element.

`Example:`

```java
WebElement element = driver.findElement(By.xpath("//form[@id='login']//input[@name='username']"));
```
## Absolute XPath
Absolute XPath uses the full path from the root element, starting from <html> and traversing all parent-child relationships.

`Example:`

```java
WebElement element = driver.findElement(By.xpath("/html/body/div/form/input[1]"));
```

> [!Warning] 
> Absolute XPath is fragile and not recommended for most use cases because small DOM changes may break the path.

## Relative XPath vs Absolute XPath

**Relative XPath:** More flexible, starts with //, and is less prone to breaking if the structure changes.

**Example:** `//button[@name='submit']`

**Absolute XPath:** Starts from the root element and includes the entire hierarchy, which makes it very brittle if the HTML structure changes.

**Example:** `/html/body/div/form/button`

## Combining Locators
You can combine multiple strategies to improve accuracy. For example, you can use XPath to locate an element by its text and CSS classes, or use CSS Selectors with specific attributes.

`Example:`

```java
WebElement element = driver.findElement(By.xpath("//div[@class='container']//button[contains(text(),'Submit')]"));
```

## Best Practices for Choosing Locators
- Prefer ID over other locators when possible since it is the fastest and most reliable.
- Use CSS Selectors for complex queries and when you need flexibility.
- Use XPath when you need to locate elements by text or need to traverse the DOM in a more complex way.
- Avoid absolute XPath as it tends to break if there are small changes to the HTML structure.
- If the element's text is dynamic, use partial link text or CSS Selectors.

## Summary Table

| Locator Type | Example | Best Use Case | Pros | Cons |
| ------------ | ------- | ------------- | ---- |------|
| ID | `By.id("username")` | Unique elements | Fast, unique | Only works if ID is unique |
| Name | `By.name("email")` | Form elements | Easy to use | Not always unique |
| Class Name | `By.className("submit-button")` | Elements with a common style | Simple, good for repeated elements | Can be non-unique |
| Tag Name | `By.tagName("button")` | Tags like `<button>`, `<input>`, etc. | Quick and easy | Not specific for complex pages |
| Link Text | `By.linkText("Sign Up")` | Links with exact text | Reliable for static links | Doesn't work for dynamic text links |
| Partial Link Text | `By.partialLinkText("Sign")` | Links with part of the text | Good for long dynamic links |Needs to be unique |
| CSS Selector | `By.cssSelector(".submit-button")` | Complex structure, attributes, classes | Flexible, fast | Can be hard to understand for complex queries |
| XPath	| `By.xpath("//div[@id='main']//button[text()='Click']")` | Complex DOM traversal, dynamic elements | 	Very powerful, flexible | Slower than CSS, complex maintenance |