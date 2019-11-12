package com.spartaglobal.Selenium_Example.BBCSites.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DemoForm {

    private WebDriver driver;
    private String homepageURL = "https://www.toolsqa.com/automation-practice-form/";
    private By cookieButton  = By.id("cookie_action_close_header");
    private By firstname = By.name("firstname");
    private By lastname = By.id("lastname");
    private By submitButton = By.id("buttomwithclass");
    private By sexElements = By.name("sex");
    private By yearOfExperience = By.name("exp");
    private By datePicker = By.id("datepicker");
    private By profession = By.name("profession");
    private By continents = By.id("continents");



    public DemoForm(WebDriver driver) {
        this.driver = driver;
    }

    public void goFormHomepage(){
        driver.navigate().to(homepageURL);
    }

    public void clickCookieButton(){
        driver.findElement(cookieButton).click();
    }

    public void inputFirstName(String firstNameText ){
        driver.findElement(firstname).sendKeys(firstNameText);
    }

    public void inputLastName(String lastNameText ){
        driver.findElement(firstname).sendKeys(lastNameText);
    }

    public String getFirstNameFieldText(){
        return driver.findElement(firstname).getAttribute("value");
    }

    public String getLastNameFieldText(){
        return driver.findElement(lastname).getAttribute("value");
    }

    public String getCurrentURL (){
        return driver.getCurrentUrl();
    }

    public void getSexElement(){
        List<WebElement> sexItems = driver.findElements(sexElements);

        for (org.openqa.selenium.WebElement sexItem : sexItems){
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();
        }
    }


    public void getYearsOfExperience(){
        List<WebElement> yearsOfExperience = driver.findElements(yearOfExperience);

        for (org.openqa.selenium.WebElement experienceYears : yearsOfExperience){
            driver.findElement(By.id(experienceYears.getAttribute("id"))).click();
            driver.findElement(By.id(experienceYears.getAttribute("id"))).isSelected();
        }
    }

    public void inputDate (String dateText){
        driver.findElement(datePicker).sendKeys(dateText);
    }

    public String getDatepickerFieldText(){
        return driver.findElement(datePicker).getAttribute("value");
    }

    public void getProfession(){
        List<WebElement> professions = driver.findElements(profession);

        for (org.openqa.selenium.WebElement professionItems : professions){
            driver.findElement(By.id(professionItems.getAttribute("id"))).click();
            driver.findElement(By.id(professionItems.getAttribute("id"))).isSelected();
        }
    }

    public void getContinents(){
        WebElement continent = driver.findElement(continents);
        System.out.println(continent.getAttribute("value"));
        Select options = new Select(continent);
        for (int i = 0; i < options.getOptions().size() ; i++) {
        options.selectByIndex(i);
        System.out.println(options.getFirstSelectedOption().getText());
        }
    }

}





//chromeDriver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
//        chromeDriver.findElement(By.id("cookie_action_close_header")).click();
////       chromeDriver.findElement(By.linkText("Partial link Test")).click();
////       chromeDriver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
//        chromeDriver.findElement(By.name("firstname")).sendKeys("Dana");
//        chromeDriver.findElement(By.id("lastname")).sendKeys("Awua");
//        chromeDriver.findElement(By.id("buttonwithclass")).click();
//        //chromeDriver.findElement(By.id("sex-1")).click();
//
//        for (int i = 0; i <= 1; i++) {
//        chromeDriver.findElement(By.id("sex-" + i)).click();
//        }
//
//        for (int i = 0; i <= 6; i++) {
//        chromeDriver.findElement(By.id("exp-" + i)).click();
//        }
//
//        chromeDriver.findElement(By.id("datepicker")).sendKeys("11/11/2019");
//
//        for (int i = 0; i <= 1; i++) {
//        chromeDriver.findElement(By.id("profession-" + i)).click();
//        }
//
//        Select drpContinents = new Select(chromeDriver.findElement(By.name("continents")));
//        drpContinents.selectByVisibleText("Africa");
//
//        WebElement continetElement = chromeDriver.findElement(By.id("continets-multiplselect"));
//        Select select1 = new Select(continetElement);
//        for (int i = 0; i < select1.getOptions().size() ; i++) {
//        select1.selectByIndex(i);
//        }
//
//        //chromeDriver.findElement(By.id("submit")).click();
//        for (int i = 0; i <= 3; i++) {
//        chromeDriver.findElement(By.id("submit" + i)).click();
//        }
//
//        chromeDriver.findElement(By.className("facebook")).click();



