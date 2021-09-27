package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day01_FirefoxBrowserDemo {
    public static void main(String[] args) {
         /*
            https://www.mozilla.org/en-US/firefox/new/
            https://github.com/mozilla/geckodriver/releases
            Create a new class under : FirefoxBrowserDemo
            Create main method
            Set Path
            Create gecko driver
            Open google home page https://www.google.com/
            Maximize the window
            Close/Quit the browser
     */


//      Set Path
        System.setProperty("webdriver.gecko.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/geckodriver.exe");

//      Create gecko driver
        WebDriver driver = new FirefoxDriver();

//      Open google home page https://www.google.com/
        //ALL OTHER COMMENDS ARE THE SAME FOR ALL BROWSER TYPES
        driver.get("https://www.google.com");

//      Maximize the window
        driver.manage().window().maximize();

//      Close/Quit the browser
        driver.quit();


    }
}
