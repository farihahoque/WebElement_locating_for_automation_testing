package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Browsepage extends Driversetup{
    @Test
    public void loadPage()
    {

        //Open a browser
        // WebDriver driver=new ChromeDriver();
        //load url https://www.google.com
        driver.get("https://www.gadstyle.com/");

        //test title
        Assert.assertEquals(driver.getTitle(),"GadStyle BD: Online Shopping in Bangladesh for Gadgets & Gear");

        //test url
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.gadstyle.com/");
         System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement search= driver.findElement(By.name("phrase"));
        //driver.findElement(By.className("wd-promo-banner-link wd-fill")).click();
       // driver.findElement(By.tagName("search")).sendKeys("speakers");
        search.sendKeys("speakers");
        search.clear();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.findElement(By.partialLinkText("Shop by Category")).click();
        //Css selector
        driver.findElement(By.cssSelector("input[name='phrase']")).sendKeys("headphone");
       //driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys("headphone");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}