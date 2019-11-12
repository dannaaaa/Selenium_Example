package com.spartaglobal.Selenium_Example.BBCSites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCHomepage {

    private WebDriver driver;
    private String homepageURL = "https://www.bbc.co.uk/";

    private By signInLinkID = By.id("idcta-link");

    public BBCHomepage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToBBCHomepage(){
        driver.navigate().to(homepageURL);
    }

    public void clickSignInLink(){
        driver.findElement(signInLinkID).click();
    }

    public void closeDriver(){
        driver.close();
    }


}
