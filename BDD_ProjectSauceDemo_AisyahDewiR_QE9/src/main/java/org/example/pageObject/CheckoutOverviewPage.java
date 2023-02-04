package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
    private final WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath ="//div[@class='cart_list']")
    private WebElement vrfyCartList;

    public boolean setVrfyCartList() {
        return vrfyCartList.isDisplayed();
    }
    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement itemChosenPrice;
    public Float setItemChosenPrice(){
        String a = itemChosenPrice.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }
    @FindBy(xpath ="//div[@class='summary_subtotal_label']")
    private WebElement vrfyItem;
    public Float setItem(){
        String a = vrfyItem.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }
    @FindBy(xpath ="//div[@class='summary_tax_label']")
    private WebElement vrfyTotalTax;
    public boolean setVrfyTotalTax() {
        return vrfyTotalTax.isDisplayed();
    }
    public Float setVrfyTotalwithTax() {
        String a = vrfyTotalTax.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }

    @FindBy(xpath ="//div[@class='summary_total_label']")
    private WebElement vrfyTotal;
    public Float setTotal(){
        String a = vrfyTotal.getText();
        String b = a.replaceAll("[^0-9.]", "");
        float c = Float.parseFloat(b);
        return c;
    }
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement btnFinish;
    public void setBtnFinish(){

        btnFinish.click();
    }

    @FindBy(xpath = "//div[@class='header_secondary_container']")
    private WebElement vrfyCheckoutComplete;
    public boolean setvrfyCheckoutComplete() {
        return vrfyCheckoutComplete.isDisplayed();
    }


}
