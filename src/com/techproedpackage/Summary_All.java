package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Summary_All {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
            "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().to("http://amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(3000);

        String pageSource = driver.getPageSource();
        if(pageSource.contains("Best Sellers")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        System.out.println("----------------------------------");

        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ExpectedTitle: " + expectedTitle);
            System.out.println("ActualTitle: " + actualTitle);
        }

        driver.close();

    }
}
