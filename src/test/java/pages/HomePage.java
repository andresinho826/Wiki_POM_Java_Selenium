package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class HomePage extends BasePage{
    //WebDriver driver;
    @FindBy(id="searchInput")
    private WebElement searchInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitBtn;

    @FindBy(css = ".footer-sidebar-text + div.footer-sidebar-text")
    private WebElement footerText;

    @FindBy(className = "central-featured-lang")
    private List<WebElement> lang_list;

    public void setBarText(String text) {
        this.searchInput.sendKeys(text);
    }

    public SearchResultsPage clickOnSearch() {

        this.submitBtn.click();
        return new SearchResultsPage(this.driver);
    }

    public String getFooterText() {
        this.isElementDisplayed(this.footerText);
        return this.footerText.getText();
    }

    public HomePage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }


    /*List<WebElement> lang_list =
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(
                    "central-featured-lang")));
      softAssert.assertEquals(lang_list.size(), 10);


      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        softAssert.assertTrue(submitBtn.isDisplayed());
        homePage.clickOnSearch();
        driver.close();
        //softAssert...0;

     */
}
