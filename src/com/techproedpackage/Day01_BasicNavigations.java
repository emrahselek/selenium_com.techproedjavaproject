package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

//      Set the path
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

//      Create/Open chrome driver
        WebDriver driver = new ChromeDriver();

//      Maximize the window
        driver.manage().window().maximize();

//      Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        Thread.sleep(5000);//putting 5 seconds hard wait

//      On the same class, Navigate to amazon home page https://www.amazon.com/
//      driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");

//      Navigate back to google
        driver.navigate().back();
        Thread.sleep(5000);

//      Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(5000);

//      Refresh the page
        driver.navigate().refresh();

//      Close/Quit the browser
        driver.close();
//      driver.quit();

        /**NOTES:
         * What is the difference between "get()" and "navigate().to()" ?
         * 1.get() is used more than navigate().to(), cause it is shorter
         * 2.get() is a little faster
         * 3.get() takes ONLY string as parameter, but navigate().to() takes string or URL as parameter
         * 4.navigate() has follow-up methods(forward, back, refresh)
         * --------------------------------------------------------------
         * What is the difference between close() and quit()?
         * close()-> closed only the current working browser
         * quit()-> closed all working browser. Quit is strong close.
         *----------------------------------------------------
         * How to add some wait using JAVA?
         * Thread.sleep(5000);-> wait for 5 second before the next step
         * This is a JAVA wait. This is not selenium wait
         * For this reason, Thread.sleep() is not recommended to use.
         * Because this is a HARD WAIT. It means page will wait not matter what.
         * For example. if page need only 1 second, then page will wait 5 seconds based on Thread.sleep(5000);
         * Note: that we will learn Selenium wait to wait DYNAMICALLY
         * We need selenium waits for FASTER EXECUTION WITHOUT EXTRA WAITING
         * */

    }
}