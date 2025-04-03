package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    @AfterMethod
    public void tearDown() {
    driver.quit();
    }
}