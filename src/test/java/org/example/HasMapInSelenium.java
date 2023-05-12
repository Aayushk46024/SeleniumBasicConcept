package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class HasMapInSelenium {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://classic.crmpro.com/login.cfm");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("username")).sendKeys(getCredentialUserName("Admin"));
        driver.findElement(By.name("password")).sendKeys(getCredentialUserPasscode("Admin"));
    }

    public static HashMap<String, String> getCredentialMap(){
        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("Customer", "Aayush:@Aayush1234");
        userMap.put("Admin", "Admin:@Admin1234");
        userMap.put("Seller", "Seller:@Seller1234");
        return userMap;
    }

    public static String getCredentialUserName(String username){

        String credentialUserName = getCredentialMap().get(username);
        return credentialUserName.split(":")[0];
    }

    public static String getCredentialUserPasscode(String passcode){
        String credentialUserPasscode = getCredentialMap().get(passcode);
        return credentialUserPasscode.split(":")[1];
    }

}
