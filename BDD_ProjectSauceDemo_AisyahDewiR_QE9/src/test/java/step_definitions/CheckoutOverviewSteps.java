package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CheckoutOverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewSteps {
    private WebDriver webDriver;
    public CheckoutOverviewSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User ensure the item total and tax")
    public void verifyYourCartList() throws InterruptedException {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        Assert.assertTrue(checkoutOverviewPage.setVrfyCartList());
        Assert.assertEquals(checkoutOverviewPage.setItemChosenPrice(),checkoutOverviewPage.setItem(), 0);
        Assert.assertTrue(checkoutOverviewPage.setVrfyTotalTax());
        Thread.sleep(2000);
        }
    @And("User ensure the total price after sum with the tax")
    public void verifyTotalPrice() throws InterruptedException{
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        Assert.assertEquals(checkoutOverviewPage.setItem()+checkoutOverviewPage.setVrfyTotalwithTax(), checkoutOverviewPage.setTotal(),0);
        Thread.sleep(2000);
    }
    @Then("User Has Completed the Checkout Order")
    public void verifyCheckoutOrderPage() throws InterruptedException{
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        checkoutOverviewPage.setBtnFinish();
        Assert.assertTrue(checkoutOverviewPage.setvrfyCheckoutComplete());
        Thread.sleep(4000);
    }


}
