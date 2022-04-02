package com.training.automation.pagekeywords.searchpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartSearchPage implements SerachResultPage{
    

    public FlipkartSearchPage(WebDriver driver){

    }

    @FindBy(css = "div.product-title")
    WebElement productName;

    @Override
    public void addToCart() {
        productName.click();
        
    }

    @Override
    public void addToCart(String productName) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getItemPrice(String productName) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
