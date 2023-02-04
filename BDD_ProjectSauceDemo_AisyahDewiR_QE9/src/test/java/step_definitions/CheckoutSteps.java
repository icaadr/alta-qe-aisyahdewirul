package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CartPage;
import org.example.pageObject.CheckoutInfoPage;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    private WebDriver webDriver;
    public CheckoutSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User already on checkout page")
    public void verifyYourCartPage() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyYourCartPage());
        Thread.sleep(3000);
        cartPage.removeBasket1();
        Thread.sleep(3000);
        cartPage.setProcessCheckout();
        Thread.sleep(3000);
    }
    @When("User input \"(.*)\" as userFirst and input \"(.*)\" as last and input \"(.*)\" as zip")
    public void inputCredential(String userFirst, String userLast, String userZip) throws InterruptedException{
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(webDriver);
        Assert.assertTrue(checkoutInfoPage.verifyYourCartInfoPage());
        checkoutInfoPage.setUserFirstName(userFirst);
        Thread.sleep(4000);
        checkoutInfoPage.setUserLastName(userLast);
        Thread.sleep(4000);
        checkoutInfoPage.setUserZip(userZip);
        Thread.sleep(4000);
        checkoutInfoPage.setContinue();
        Thread.sleep(4000);
        Assert.assertTrue(checkoutInfoPage.verifyYourCheckOutPage());
        Thread.sleep(4000);
    }

}
