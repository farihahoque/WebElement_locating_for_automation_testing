package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Advancedtest extends Driversetup {
            @Test
             public void testAdvanced() throws InterruptedException {
                driver.get("https://www.gadstyle.com/");
                WebElement title = driver.findElement(By.cssSelector("input"));
                title.sendKeys("speaker");
                Thread.sleep(1000);
                title=driver.findElement(By.xpath("//input"));//css selector with tagname
                title.clear();
                String value = driver.findElement(By.cssSelector(".orig")).getAttribute("name");//css selector with class and get attribute
                System.out.println(value);
                System.out.println(driver.findElement(By.xpath("//div[@class='container main-footer']/div/div/div/div/ul/li/ul[@class='sub-sub-menu']/li/a[@title='Reviews']")).getText());
                String text =driver.findElement(By.cssSelector("div[class='wpb_wrapper']>ul>li>ul>li>a[href='https://www.gadstyle.com/reviews/']")).getText();
                System.out.println(text);

                System.out.println(driver.findElement(By.cssSelector("div[id='wd-627d70ce75fcc']>div[class='info-box-content']>div[class^='info-box-subtitle subtitle-color-default wd-fontsize-xs subtitle-style-default wd-font-weight-400']")).getText());
                System.out.println(driver.findElement(By.xpath("//div[@id='wd-627d70ce75fcc']/div[@class='info-box-content']/div[starts-with(@class,'info-box-subtitle subtitle-color-default wd-fontsize-xs subtitle-style-default wd-font-weight-400')]")).getText());

                System.out.println(driver.findElement(By.cssSelector("div[id='wd-627d70ce75fcc']>div[class='info-box-content']>div[class*='info-box-subtitle subtitle-color-default wd-fontsize-xs subtitle-style-default wd-font-weight-400']")).getText());
                System.out.println(driver.findElement(By.xpath("//div[@id='wd-627d70ce75fcc']/div[@class='info-box-content']/div[contains(@class,'info-box-subtitle subtitle-color-default wd-fontsize-xs subtitle-style-default wd-font-weight-400')]")).getText());


               driver.get("https://rahulshettyacademy.com/AutomationPractice/");
               System.out.println(driver.findElement(By.cssSelector("tr> th:nth-child(2)")).getText());
               System.out.println(driver.findElement(By.xpath("//tr/th[4]")).getText());

                System.out.println(driver.findElement(By.cssSelector("tr> th:last-child")).getText());
                System.out.println(driver.findElement(By.xpath("//tr/th[last()]")).getText());

                System.out.println(driver.findElement(By.cssSelector("tr> th:nth-child(2)")).getText());
                System.out.println(driver.findElement(By.xpath("//tr/th[4]")).getText());

                System.out.println(driver.findElement(By.xpath("//th[text()='Position']")).getText());

                System.out.println(driver.findElement(By.xpath("//th[text()='Amount']/preceding-sibling::th[2]")).getText());
                System.out.println(driver.findElement(By.xpath("//th[text()='Instructor']/following-sibling::th[last()]")).getText());

            }
}

