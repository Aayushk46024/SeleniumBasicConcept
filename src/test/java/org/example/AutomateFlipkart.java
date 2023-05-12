package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomateFlipkart {
    static String cyclesValues;
    static int maxValue;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/sports/cycling/cycles/pr?sid=abc%2Culv%2Cixt&p%5B%5D=facets.gear_type%255B%255D%3DNon%2BGeared&p%5B%5D=facets.fulfilled_by%255B%255D%3DPlus%2B%2528FAssured%2529&hpid=WXirg7reAiTX0n-6u1knE6p7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJVcCB0byA0MCUgT2ZmIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiQ0NFR0hGOEFSWUtBUFlZQiIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIk5vbi1HZWFyZWQgQ3ljbGVzIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&fm=neo%2Fmerchandising&iid=M_0b41a33c-6af3-4469-8002-34e65a49e8bf_6.9VC7LRFQVVQN&ppt=hp&ppn=homepage&ssid=u2qwyfhos00000001681900226524&otracker=hp_omu_Beauty%252C%2BFood%252C%2BToys%2B%2526%2Bmore_4_6.dealCard.OMU_9VC7LRFQVVQN_4&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Beauty%252C%2BFood%252C%2BToys%2B%2526%2Bmore_NA_dealCard_cc_4_NA_view-all_4&cid=9VC7LRFQVVQN");
        driver.manage().window().maximize();

        List<WebElement> priceOfCycles = driver.findElements(By.xpath("//a[@class=\"_8VNy32\"]//div[@class=\"_30jeq3\"]"));
        for (int i = 1; i < priceOfCycles.size(); i++) {
            cyclesValues = priceOfCycles.get(i).getText().replaceAll("₹", "").replaceAll(",", "");
            int values = Integer.valueOf(cyclesValues);
            System.out.println(values);
        }
        driver.close();
    }
}
