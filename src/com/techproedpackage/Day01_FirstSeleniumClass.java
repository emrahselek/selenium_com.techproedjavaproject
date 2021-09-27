package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {

public static void main(String[] args) {
    //1. We must set the TYPE and PATH of the driver with System.setProperty() method
    //This is unique for Java Project
    //When we learn maven, we will not use System.setProperty()
    System.setProperty("webdriver.chrome.driver",
            "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

    //2.Create Webdriver object. This is a must before creating any automation script
    //Note: when we create driver object, I use polymorphism
    WebDriver driver = new ChromeDriver();

    //get() is used to go to a url
    driver.get("http://www.amazon.com");
}

}
