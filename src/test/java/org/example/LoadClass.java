package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoadClass {

    WebDriver driver;

    @Test
    public void loadTesting() throws InterruptedException {
//        ChromeOptions co = new ChromeOptions();
//        co.addArguments("incognito");
//        co.setHeadless(true);

        driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.name("q"));
        Actions action = new Actions(driver);
        action.moveToElement(element).click().sendKeys("Selenium with java").build().perform();
        Thread.sleep(2000);
        String title = driver.getTitle();
        Assert.assertEquals(title, driver.getTitle());

        List<WebElement> retrieveText = driver.findElements(By.xpath("//li[@class=\"sbct\" and @role=\"presentation\"]"));
        for(int i=0; i <= retrieveText.size(); i++){
            System.out.println(retrieveText.get(i).getText());
            Assert.assertNotNull(retrieveText.get(i).getText().contains("selenium"));
            retrieveText.get(1).click();
            List<WebElement> retrieveHyperlink = driver.findElements(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]"));
            for (int j=1; j<retrieveHyperlink.size(); j++){
                System.out.println(retrieveHyperlink.get(j).getText());
            }
            break;
        }
        driver.close();
        driver.quit();
    }
}
