package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_VerifyURLTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to google homepage
        driver.get("https://www.google.com/");

        //Verify if google homepage url is “www.google.com”
        String expectedURL="www.google.com";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PAS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected URL: "+expectedURL);
            System.out.println("Actual URL: "+actualURL);
        }

        driver.close();

        /*
            FAIL
            Expected URL: www.google.com
            Actual URL: https://www.google.com/
         */


    }
}


















