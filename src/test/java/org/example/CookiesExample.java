package org.example;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Last Size of cookies : - " + cookies.size());

        Cookie cookieObj = new Cookie("ghghgh", "549645654684949847984tfrtdrtfy");
        driver.manage().addCookie(cookieObj);

        for(Cookie cookie:cookies) {
            System.out.println( cookie.getName() + " " + cookie.getValue());
        }

        System.out.println("Current Size of cookies : - " + cookies.size());

        driver.manage().deleteCookie(cookieObj);
        System.out.println("Current Size of cookies : - " + cookies.size());
        driver.manage().deleteAllCookies();
        System.out.println("Current Size of cookies : - " + cookies.size());

        driver.manage().deleteAllCookies();
//        driver.close();
    }
}
