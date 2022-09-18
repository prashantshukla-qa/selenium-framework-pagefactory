package com.qagenic.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    WebDriver driver;

    public WikipediaPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "searchInput")
    private WebElement inputBox;

    @FindBy(css = "i.svg-search-icon")
    private WebElement searchButton;

    public String verifyTitle(){
        return this.driver.getTitle();
    }

    public void searchonWikiPage(String searchTerm){
        this.inputBox.sendKeys(searchTerm);
        this.searchButton.click();
    }
}
