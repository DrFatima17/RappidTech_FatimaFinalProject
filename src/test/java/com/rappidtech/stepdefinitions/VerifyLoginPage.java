package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.HomePage;
import com.rappidtech.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLoginPage {
    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();

    @When("user clicks on MyAccount Link")
    public void user_clicks_on_my_account_link() {
        homePage.clickMyAccountButton();
    }
    @And("user clicks on SignIn Link")
    public void user_clicks_on_sign_in_link() {
       homePage.clickSigninLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("user is able to see the sign in label")
    public void user_is_able_to_see_the_sign_in_label() {
      loginPage.isSignInLabelDisplayed();
    }
    @Then("user is able to see the sign in fields")
    public void user_is_able_to_see_the_sign_in_fields() {
       loginPage.isEmailInputBoxDisplayed();
       loginPage.isPasswordInputBoxDisplayed();
       loginPage.isRememberMeButtonDisplayed();
       loginPage.isSignInButtonDisplayed();
    }


}
