package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        //driver.findElement(By.tagName("h1")); Alt+Enter find element by tag name
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());


        //driver.findElement(By.tagName("a")); Alt+Enter find element by tag name
        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());


        //find list of elements by tag name
        //driver.findElements(By.tagName("a")); Alt+Enter find element by tags name
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }

    @Test
    public void findElementBySimpleLocators() {
//by id
        driver.findElement(By.id("city"));

        //by className
        driver.findElement(By.className("header"));
        System.out.println(driver.findElement(By.className("header")).getText());
        //by linkText
        driver.findElement(By.linkText("Let the car work"));
        // by partialLinkText
        driver.findElement(By.partialLinkText("car"));


    }
    @Test
    public void findElementByCssSelector() {
        //tagfName-> == css
        //driver.findElement(By.tagName("h1"));
        driver.findElement(By.cssSelector("h1"));

        //id-> css
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));


        //by className-> css(.)
        //driver.findElement(By.className("header")); //by className
         driver.findElement(By.cssSelector(".header"));

//[attr='value']
        driver.findElement(By.cssSelector("[href='/registration?url=%2Fsearch']"));
        //contains ->* all search
        driver.findElement(By.cssSelector("[href*='/registration']"));
        //start ->^ in start search
        driver.findElement(By.cssSelector("[href^='/reg']"));
//end ->$ end search
        driver.findElement(By.cssSelector("[href$='/search]"));

    }

}

