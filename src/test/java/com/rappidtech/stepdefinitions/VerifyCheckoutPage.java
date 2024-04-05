package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.CartPage;
import com.rappidtech.pages.CheckOutPage;
import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCheckoutPage {
    CartPage cartPage = new CartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

//    @Given("user is navigated successfully to cart page")
//    public void user_is_navigated_successfully_to_cart_page() {
//        Driver.getDriver().get("https://www.visionworks.com/cart");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
  //  }
    @When("user clicks on checkout button in cart page")
    public void user_clicks_on_checkout_button_in_cart_page() {
       cartPage.clickOnCheckOutButton();
    }
    @Then("user is able to see new customer label")
    public void user_is_able_to_see_new_customer_label() {
        checkOutPage.isNewCustomerLabelDisplayed();
    }
}