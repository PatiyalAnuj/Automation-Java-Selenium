- [xpath Locators](#xpath-locators)
    1. [Absolute or Full xpath](#absolute-or-full-xpath)
    1. [Relative or Partial xpath](#relative-or-partial-xpath)
- [Create Custom xpath](#techniques-to-create-custom-xpath)
   1. [Using Attributes](#using-attributes)
      1. [Text](#select-a-link-that-contains-specific-text)
      1. [Partial Text](#select-an-element-containing-partial-text)
      1. [starts-with function](#select-an-element-where-the-text-starts-with-a-specific-string)
      1. [Ends](#select-an-element-where-the-text-ends-with-a-specific-string)
   1. [Using Hierarchical Relationships](#using-hierarchical-relationships)
      1. [Select a `<span>` inside a `<div>` with a specific class:](#select-a-span-inside-a-div-with-a-specific-class)
      1. [Select the second `<li>` in a list](#select-the-second-li-in-a-list)
  1. [Using Multiple Conditions](#using-multiple-conditions)
     1. [Using and](#using-and)
     1. [Select a `<button>` that is either enabled or has specific text](#select-a-button-that-is-either-enabled-or-has-specific-text)
  1. [Using Position and Indexing](#using-position-and-indexing)
     1. [Select the first `<li>` inside an `<ul>`](#select-the-first-li-inside-an-ul)
     1. [Select the last `<li>` inside an `<ul>`](#select-the-last-li-inside-an-ul)
     1. [Select the second-to-last `<li>`](#select-the-second-to-last-li)
        1. [Xpath Axes](#using-ancestor-descendant-preceding-and-following-axes)
           1. [Select a span element that is a descendant of a div with a specific id](#select-a-span-element-that-is-a-descendant-of-a-div-with-a-specific-id)
           1. [Select a button that is a preceding sibling to a div](#select-a-button-that-is-a-preceding-sibling-to-a-div)
           1. [Select a p element that is an ancestor of a span](#select-a-p-element-that-is-an-ancestor-of-a-span)
           1. [Using `not()` Function](#using-not-function)
              1. [Select all `<input>` elements except those with the type submit](#select-all-input-elements-except-those-with-the-type-submit)
           1. [Combining Multiple Conditions and Wildcards](#combining-multiple-conditions-and-wildcards)
              1. [Select any element with a data-attribute (wildcard) and a specific value](#select-any-element-with-a-data-attribute-wildcard-and-a-specific-value)
              1. [Select all links within a specific class](#select-all-links-within-a-specific-class)
           

# XPATH Locators
## Absolute or Full xpath
An absolute XPath starts from the root element and provides the complete path to the target element.

`Syntax:` It begins with a `/` (forward slash).

`Example:`
```java
/html/body/div[2]/ul/li[3]
```
### Advantages:
- Precise and unique path from the root to the element.
- Often used when the structure of the document is static and well-known.

### Disadvantages:
- If the structure of the document changes (e.g., an element is added or removed at an earlier level), the absolute XPath may break.
- Less flexible, as it’s very dependent on the document's exact structure.

>[!Warning]
> Not Recommended as using complete element address from starting point to till element.

## Relative or Partial xpath
A relative XPath does not start from the root element but rather from a specific node, allowing you to navigate the document more flexibly.
`Syntax:` It starts with a `//` (double forward slash), which means "select anywhere in the document."
# Techniques to create custom xpath:
## Using Attributes:
`Syntax:`
```java
driver.findElement(By.xpath("//tagName[@attribute='value']"));
// example is below
 driver.findElement(By.xpath("//*[@href='https://www.example.com']"));
```
`//` --> relative xpath
`tagName` --> name of the tag, provide `*` for all tags
`@attribute='value'`--> name of the attribute and its value in single quotes

### Select a link that contains specific text:
use `text()` function

`Syntax:`
```java
driver.findElement(By.xpath("//a[text()='Sign Up']")); // specific text
//This selects any <a> (anchor) element whose text content is exactly "Sign Up".
```
### Select an element containing partial text:
`Syntax:`
```java
driver.findElement(By.xpath("//a[contains(text(), 'Sign')]")); // partial text
//This selects any <a> element where the text content contains the word "Sign".
```

### Select an element where the text starts with a specific string:
`Syntax:`
```java
driver.findElement(By.xpath("//a[starts-with(text(), 'Log')]")); // text starting with
//This selects any <a> element whose text starts with "Log" (e.g., "Login", "Logout").
```
### Select an element where the text ends with a specific string:
`Syntax:`
```java
driver.findElement(By.xpath("//a[ends-with(text(), 'Now')]")); //  ending text
//This selects any <a> element whose text ends with "Now" (requires XPath 2.0+).
```

## Using Hierarchical Relationships
### Select a `<span>` inside a `<div>` with a specific class:
`Syntax:`
```java
driver.findElement(By.xpath("//div[@class='header']/span"));
//This selects all <span> elements that are directly inside a <div> element with the class='header'.
```
### Select the second `<li>` in a list:
`Syntax:`
```java
driver.findElement(By.xpath("//(//ul/li)[2]"));
// This selects the second <li> element inside any <ul> element.
```
## Using Multiple Conditions
### Using and
`Syntax:` 
```java
driver.findElement(By.xpath("//*[@class='active' and @id='menu']"));
//This selects an element that has both the class='active' and id='menu' attributes.
```
### Select a `<button>` that is either enabled or has specific text:
`Syntax:`
```java
driver.findElement(By.xpath("//button[@enabled='true' or text()='Submit']"));
//This selects a <button> element that either has the attribute enabled="true" or contains the text "Submit"
```

## Using Position and Indexing
### Select the first `<li>` inside an `<ul>`:
`Syntax:`
```java
driver.findElement(By.xpath("//ul/li[1]"));
// This selects the first <li> inside any <ul> element.
```
### Select the last `<li>` inside an `<ul>`:
`Syntax:`
```java
driver.findElement(By.xpath("//ul/li[last()]"));
//This selects the last <li> inside any <ul> element.
```
### Select the second-to-last `<li>`:
`Syntax:`
```java
driver.findElement(By.xpath("//ul/li[last()-1]"));
//This selects the second-to-last <li> inside any <ul> element.
```
##  Using `ancestor`, `descendant`, `preceding`, and `following` Axes
### Select a span element that is a descendant of a div with a specific id:
`Syntax:`
```java
driver.findElement(By.xpath("//div[@id='content']//span"));
// This selects all span elements that are descendants of the div with the id='content'.
```
### Select a button that is a preceding sibling to a div:
`Syntax:`
```java
driver.findElement(By.xpath("//div[@id='container']/preceding-sibling::button"));
//This selects a button element that is a preceding sibling to the div with the id='container'.
```
### Select a p element that is an ancestor of a span:
`Syntax:`
```java
driver.findElement(By.xpath("//span/ancestor::p"));
//This selects the nearest p element that is an ancestor of a span.
```

##  Using `not()` Function
### Select all `<input>` elements except those with the type submit:
`Syntax:`
```java
driver.findElement(By.xpath("//input[not(@type='submit')]"));
// This selects all <input> elements that do not have the type="submit" attribute.
```
## Combining Multiple Conditions and Wildcards
### Select any element with a data-attribute (wildcard) and a specific value:
`Syntax:`
```java
driver.findElement(By.xpath("//*[@data-*='value']"));
// This selects any element whose attribute starts with data-`*` and contains the value.
```
### Select all links within a specific class:
`Syntax:`
```java
driver.findElement(By.xpath("//div[@class='header']//a"));
//This selects all <a> elements within a <div> element with the class header.
```
### Advantages:
- More flexible and robust. It doesn’t require knowledge of the exact structure of the document.
- Easier to maintain when the document structure changes, as it can locate elements by their properties (e.g., class, id, or attributes).
### Disadvantages:
- Might be less specific, especially if multiple elements match the same criteria, leading to potential ambiguities.
- Can be slower in large documents since it searches the entire document (unless specific conditions or nodes are applied).

