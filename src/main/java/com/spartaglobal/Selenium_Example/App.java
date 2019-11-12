package com.spartaglobal.Selenium_Example;

import com.spartaglobal.Selenium_Example.BBCSites.pages.BBCHomepage;
import com.spartaglobal.Selenium_Example.BBCSites.pages.DemoForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dana Korang-Awua\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();

        DemoForm demoForm = new DemoForm(chromeDriver);

        demoForm.goFormHomepage();
        demoForm.clickCookieButton();
        demoForm.getCurrentURL();
        demoForm.inputFirstName("Dana");
        demoForm.getSexElement();
        demoForm.getYearsOfExperience();
        demoForm.inputDate("12/11/2019");
        demoForm.getProfession();
        demoForm.getContinents();



    }
}
