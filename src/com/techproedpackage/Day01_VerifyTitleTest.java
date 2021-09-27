package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_VerifyTitleTest {

public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver",
            "C:/Users/BelomeX/Documents/selenium dependencies/drivers/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    //Navigate to google homepage
    driver.get("https://www.google.com/");
    //Verify if google title is “google”
    String expectedTitle="google";
    String actualTitle=driver.getTitle();
    if(expectedTitle.equals(actualTitle)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("ACTUAL: "+actualTitle);
        System.out.println("EXPECTED: "+expectedTitle);
    }
    driver.close();

    /*Notes:
    Our script failed because google != Google
    1. Run the script again
    2. Manual testing to make sure functionality is good
    3. Communicate with BA (Who writes Acceptance Criteria ) or sometimes PO(Providing the AC)
       to make sure the document(AC) has no error/typo

        As testers, we do not fix the documents !!! Or ignore the errors-typo, missing criteria,....

            OUR GOAL IS TO WRITE SCRIPT TO CATCH BUGS
            NOT WRITE A CODE TO PASS

    4. Should I open a JIRA?
        Follow the company culture
        Some companies do not open JIRA ticket if the story is in development
        Talk to dev to fix the issue quickly
        In this case do not open ticket

    5.When fixed, then we retest.

        In Some companies, testers open ticket as soon as they find a bug

    NOTE:   If you find a bug that is already developed,
            then we should communicate to verify the bug
            Then open a JIRA ticket.
            We create tickets to track the bugs
     */
}

}