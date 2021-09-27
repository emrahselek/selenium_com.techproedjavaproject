package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver drivero = new ChromeDriver();

        drivero.manage().window().maximize();

        drivero.get("https://www.google.com");
        Thread.sleep(3000);

        String expectedURL="https://www.google.com/";
        String actualURL=drivero.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
            System.out.println("expectedURL: "+expectedURL);
            System.out.println("actualURL: "+actualURL);
        }

        drivero.close();
   }
}
