package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {
    public static WebDriver driver;

    public CheckoutInfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private WebElement vrfyYourCartInfoPage;
    public boolean verifyYourCartInfoPage(){
        return vrfyYourCartInfoPage.isDisplayed();
    }
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement userFirstName;
    public void setUserFirstName(String userFirst){

        userFirstName.sendKeys(userFirst);
    }

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement userLastName;

    public void setUserLastName(String userLast){
        userLastName.sendKeys(userLast);
    }
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement userZip;
    public void setUserZip(String userZipCode){
        userZip.sendKeys(userZipCode);
    }

    @FindBy(id = "continue")
    private WebElement btnContinue;
    public void setContinue(){
        btnContinue.click();
    }
    //div[@class='header_secondary_container']
    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private WebElement vrfyCheckOutPage;
    public boolean verifyYourCheckOutPage(){
        return vrfyCheckOutPage.isDisplayed();
    }



}
