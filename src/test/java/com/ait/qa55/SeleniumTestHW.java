package com.ait.qa55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTestHW {

  WebDriver driver;
 @BeforeMethod
public void setUp() {
driver = new ChromeDriver();
driver.navigate().to("https://demowebshop.tricentis.com/");
driver.navigate().to("https://www.google.com");
driver.navigate().back();

}
@Test
    public void openDemoWebShopTest() {
    System.out.println("Hello!");

    }
    @AfterMethod(enabled = false)
    public void tearDown() {
    driver.quit();
    }

    @Test
    public void findElementBySimpleLocators() {
     driver.findElement(By.id("small-searchterms"));

        driver.findElement(By.className("header-menu"));
        System.out.println(driver.findElement(By.className("header-menu")).getText());
        driver.findElement(By.className("top-menu"));
        driver.findElement(By.className("account"));
        System.out.println(driver.findElement(By.className("account")).getText());
        driver.findElement(By.className("search-box-button"));
        System.out.println(driver.findElement(By.className("search-box-button")).getText());
        driver.findElement(By.className("cart-label"));
        driver.findElement(By.className("wishlist-qty"));
        System.out.println(driver.findElement(By.className("wishlist-qty")).getText());
        driver.findElement(By.className("footer"));
        System.out.println(driver.findElement(By.className("footer")).getText());
        driver.findElement(By.className("product-grid"));

        driver.findElement(By.linkText("Register"));
        System.out.println(driver.findElement(By.linkText("Register")).getText());

         driver.findElement(By.partialLinkText("Reg"));
        System.out.println(driver.findElement(By.partialLinkText("Reg")).getText());

    }
    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("#small-searchterms")); //id

        driver.findElement(By.cssSelector(".header-menu"));// class
        System.out.println(driver.findElement(By.cssSelector(".header-menu")).getText());
        driver.findElement(By.cssSelector(".top-menu"));
        driver.findElement(By.cssSelector(".account"));
        System.out.println(driver.findElement(By.cssSelector(".account")).getText());

        driver.findElement(By.cssSelector(".search-box-button"));
        System.out.println(driver.findElement(By.cssSelector(".search-box-button")).getText());
        driver.findElement(By.cssSelector(".cart-label"));
        driver.findElement(By.cssSelector(".wishlist-qty"));
        System.out.println(driver.findElement(By.cssSelector(".wishlist-qty")).getText());

        driver.findElement(By.cssSelector(".footer"));
        System.out.println(driver.findElement(By.cssSelector(".footer")).getText());

        driver.findElement(By.cssSelector(".product-grid"));

        driver.findElement(By.cssSelector("a[href='/register']"));
        System.out.println(driver.findElement(By.cssSelector("a[href='/register']")).getText());

        driver.findElement(By.cssSelector("a[href^='/reg']"));
        System.out.println(driver.findElement(By.cssSelector("a[href^='/reg']")).getText());

        driver.findElement(By.cssSelector("a[href$='/search']"));
        System.out.println(driver.findElement(By.cssSelector("a[href$='/search']")).getText());
    }

        @Test
        public void findElementByXpath() {
            // By tags
            driver.findElement(By.xpath("//input"));

            // by id
            driver.findElement(By.xpath("//input[@id='small-searchterms']"));

            // by class
            driver.findElement(By.xpath("//div[@class='header-menu']"));

            // by long text
            driver.findElement(By.xpath("//a[text()='Register']"));

            // by part text
            driver.findElement(By.xpath("//a[contains(text(),'Reg')]"));

            // by starts-with
            driver.findElement(By.xpath("//a[starts-with(@href, '/reg')]"));

            // move up
            driver.findElement(By.xpath("//a[@href='/register']/.."));
            // parent
            driver.findElement(By.xpath("//a[@href='/register']/parent::li"));
            // ancestor
            driver.findElement(By.xpath("//a[@href='/register']/ancestor::div"));

            // following-sibling
            driver.findElement(By.xpath("//h2/following-sibling::div"));

        }

    }

