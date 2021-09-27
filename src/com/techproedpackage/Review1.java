package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review1 {

    /* Review-1:
        Create a new class : Review1
        Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        Verify if the page URL contains youtube if not, print the right url.
        Then Navigate to https://www.amazon.com/
        Navigate back to youtube
        Refresh the page
        Navigate forward to amazon
        Maximize the window
        Then verify if page title includes “Amazon”, If not, print the correct title.
        Verify if the page URL is https://www.amazon.com/, if not print the correct url
        Quit the browser

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ExpectedTitle: "+ expectedTitle);
            System.out.println("ActualTitle: "+actualTitle);
        }
        System.out.println("-----------------------------------");

        String pageUrlYoutube=driver.getCurrentUrl();
        if(pageUrlYoutube.contains("youtube")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Actual pageUrl: "+ pageUrlYoutube);
        }
        System.out.println("--------------------------------");

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String amazonTitle =driver.getTitle();
        if(amazonTitle.contains("Amazon")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Aamzon Title : "+amazonTitle);
        }
        System.out.println("-------------------------------------");

        String expectedUrlAmazonx ="https://www.amazon.com/";
        String actualUrlAmazonx =driver.getCurrentUrl();
        if(expectedUrlAmazonx.equals(actualUrlAmazonx)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();

    }

}
