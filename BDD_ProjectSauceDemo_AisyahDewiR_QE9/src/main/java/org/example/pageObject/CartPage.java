package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@class='cart_list']")
    private WebElement vrfyYourCartPage;

    public boolean verifyYourCartPage(){
        vrfyYourCartPage.isDisplayed();
        return true;
    }
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeYourCart;
    public void removeBasket1(){
        removeYourCart.click();
    }
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement processCheckout;
    public void setProcessCheckout(){
        processCheckout.click();
    }





}