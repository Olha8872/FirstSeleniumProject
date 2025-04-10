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

public class TableTestsHW {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
        driver.get ("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void findElementTableWithCssTest(){
    //print number of row ряд
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for (WebElement el:rows){
            System.out.println(el.getText());

            //get row 6
            WebElement  row6 = driver.findElement(By.cssSelector("tr:nth-child(6)"));//xpath ->//tr[6]
            System.out.println(row6.getText()); ;

            //get 1 item in row
            WebElement item2 = driver.findElement(By.cssSelector("tr:nth-child(6) td:nth-child(1)"));//XPATH->//tr[6]/td[1]
            System.out.println(item2.getText());

            //get last element
            WebElement Germany = driver.findElement(By.cssSelector("tr:nth-child(7) td:last-child"));
            System.out.println(Germany.getText());

            //all table
            WebElement Table = driver.findElement(By.tagName("table"));
            System.out.println(Table.getText());


        }
    }

}
