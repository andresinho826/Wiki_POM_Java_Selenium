package com.wiki.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {
    WebDriver driver = null;
    HomePage homePage;

    @BeforeTest
    public void beforeTest(){
        String driverPath = "src/utils/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

    public HomePage getHomePage(){
        return new HomePage(driver, "https://www.wikipedia.org");
    }

}
