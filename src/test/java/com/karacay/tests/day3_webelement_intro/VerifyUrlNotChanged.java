package com.karacay.tests.day3_webelement_intro;

import com.karacay.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlNotChanged {

    /**Verify URL not changed
     open browser
     go to http://practice.cybertekschool.com/forgot_password to an external site.
     click on Retrieve password
     verify that url did not change
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl="http://practice.cybertekschool.com/forgot_password";

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("actualUrl = " + actualUrl);
            System.out.println("expectedUrl = " + expectedUrl);
        }


        Thread.sleep(3000);
        driver.quit();

    }
}
