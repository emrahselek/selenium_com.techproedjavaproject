package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

     /* Homework-1:
        Create a new class : Homework1
        Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
        Verify if the page URL contains facebook  if not, print the right url.
        Then Navigate to https://www.walmart.com/
        Verify if the walmart page title includes “Walmart.com”
        Navigate back to facebook
        Refresh the page
        Maximize the window
        Close the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String expectedtitle="facebook";
        String actualtitle = driver.getTitle();
        if(expectedtitle.equals(actualtitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedtitle: "+expectedtitle);
            System.out.println("actualttile: "+actualtitle);
        }
        System.out.println("-----------------------------------");

        String pageurl=driver.getCurrentUrl();
        if(pageurl.contains("facebook")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actual pageurl: "+pageurl);
        }
        System.out.println("---------------------------------");

        driver.get("https://www.walmart.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();


    }

}
