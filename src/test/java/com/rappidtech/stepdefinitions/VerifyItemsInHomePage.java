package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.sql.SQLOutput;
import java.util.List;


public class VerifyItemsInHomePage {
    HomePage homePage= new HomePage();
    @Then("User is able to see a list of links")
    public void user_is_able_to_see_a_list_of_links(List<String> expectedItems) {
        Assert.assertEquals(homePage.getListOfItemLinks(),expectedItems);
    }
}