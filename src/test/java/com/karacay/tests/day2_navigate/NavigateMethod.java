package com.karacay.tests.day2_navigate;

import com.karacay.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.google.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(3000);
        driver.quit();

    }
}
