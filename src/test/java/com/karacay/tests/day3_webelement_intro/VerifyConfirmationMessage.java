package com.karacay.tests.day3_webelement_intro;

import com.karacay.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {


    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     *
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailBox=driver.findElement(By.name("email"));
        emailBox.sendKeys("abcdfg@gmail.com");

        String expectedMessage="abcdfg@gmail.com";
        String actualMessage=emailBox.getAttribute("value");

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();






        Thread.sleep(3000);
        driver.quit();
    }
}
