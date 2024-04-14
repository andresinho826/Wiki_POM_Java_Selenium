package com.wiki.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchResultsPage;

import java.time.Duration;
import java.util.List;

public class WikiTest extends BaseTest{


    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testWiki() {
        HomePage homePage;
        homePage = getHomePage();
        homePage.setBarText("Selenium");
        softAssert.assertEquals(homePage.getFooterText(), "You can support our work with a donation.");
        SearchResultsPage searchResultsPage = homePage.clickOnSearch();
        softAssert.assertEquals(searchResultsPage.getPageText(), "Selenium");
        softAssert.assertAll();
    }
}
