package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CartPage;
import com.rappidtech.pages.RayBansPrescriptionPage;
import com.rappidtech.pages.RaybansDisplayPage;
import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.DriverManager;

public class VerifyCartPage {
    RaybansDisplayPage raybansDisplayPage= new RaybansDisplayPage();
    RayBansPrescriptionPage rayBansPrescriptionPage= new RayBansPrescriptionPage();
    CartPage cartPage= new CartPage();

    @Given("user is navigated successfully to Raybans Display Page")
    public void user_is_navigated_successfully_to_raybans_display_page() {
        Driver.getDriver().get("https://www.visionworks.com/rb-7159/product/0214010050084");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SeleniumUtils.acceptCookies();
    }
    @When("user clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        raybansDisplayPage.clickOnAddToCartButton();

    }
    @And("user clicks on non-prescription button")
    public void user_clicks_on_non_prescription_button() {
        rayBansPrescriptionPage.clickOnNonPrescriptionButton();

    }
    @And("user clicks on checkout button")
    public void user_clicks_on_checkout_button() {
        rayBansPrescriptionPage.clickOnCheckoutButton();

    }

    @Then("user should be able to see the item details in cart")
    public void user_should_be_able_to_see_the_checked_out_item_in_cart() {
        Assert.assertTrue(cartPage.isFrameLabelDisplayed());
        Assert.assertTrue(cartPage.isPrescriptionLabelDisplayed());
        Assert.assertTrue(cartPage.isLensMaterialLabelDisplayed());
        Assert.assertTrue(cartPage.isItemPriceLabelDisplayed());

    }
}
