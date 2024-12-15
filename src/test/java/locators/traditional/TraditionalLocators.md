
- [Traditional Locators](#traditional-locators)
    1. [id](#id)
    2. [name](#name)
    3. [className](#classname)
    4. [tagName](#tagname)
    5. [linkText](#linktext)
    6. [partialLinkText](#partiallinktext)
    7. [cssSelector](#cssselector)
    8. [xpath](#xpath)
 
# Traditional Locators
There are eight type of traditional locators in selenium:
## id
`Syntax:`
```java
WebElement id = driver.findElement(By.id("navbarDropdown"));
```
## name
`Syntax:` 
```java
WebElement id = driver.findElement(By.name("text-box"));
```
## className
`Syntax:`
```java
WebElement id = driver.findElement(By.className("input"));
```

## tagName
`Syntax:`
```java
WebElement id = driver.findElement(By.tagName("a"));
```

## linkText
`Syntax:`
```java
WebElement id = driver.findElement(By.linkText("Documentation"));
```

## partialLinkText
`Syntax:`
```java
WebElement id = driver.findElement(By.partialLinkText("Docum"));
```

## cssSelector
`Syntax:`
```java
WebElement id = driver.findElement(By.xpath("#user-name"));
```

## xpath
`Syntax:`
```java
WebElement id = driver.findElement(By.xpath("//tagName[@Attribute='AttributeValue']"));
```