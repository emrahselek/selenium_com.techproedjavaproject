package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_GetPageResource {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to google homepage
        driver.get("https://www.amazon.com/");

        //getPageSource() returns page source code as a string
        //We might use this to verify if a certain text exist in the entire page
        //Note: That pageSource is not used a lot to do assertions
        //Because it is too general and can lead false result
        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
//        System.out.println(pageSource.contains("Sign in"));
        if (pageSource.contains("Best Sellers")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.close();
    }
}