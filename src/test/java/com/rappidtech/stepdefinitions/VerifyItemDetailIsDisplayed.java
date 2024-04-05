package com.rappidtech.stepdefinitions;

import com.rappidtech.pages.RaybansDisplayPage;
import com.rappidtech.pages.WomensSunGlassesPage;
import com.rappidtech.utilities.Driver;
import com.rappidtech.utilities.SeleniumUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class VerifyItemDetailIsDisplayed {
    RaybansDisplayPage raybansDisplayPage = new RaybansDisplayPage();
    WomensSunGlassesPage womensSunGlassesPage= new WomensSunGlassesPage();

    @Given("user is navigated successfully to Sunglasses Women's Page")
    public void user_is_navigated_successfully_to_sunglasses_women_s_page() {
        Driver.getDriver().get("https://www.visionworks.com/sunglasses/women/sunglasses-women");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @When("user clicks on Ray-Ban RB {int}")
    public void user_clicks_on_ray_ban_rb(Integer int1) {
        womensSunGlassesPage.clickOnRaybanSunglasses();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user is able to see the product details")
    public void user_is_able_to_see_the_product_details(List<Map<String, String>> listOfLabels) {
        for (int i = 0; i < listOfLabels.size(); i++) {
            if (listOfLabels.get(i).get("Labels").equals("RB 7159")) {
                Assert.assertEquals(raybansDisplayPage.isBrandLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            } else if (listOfLabels.get(i).get("Labels").equals("HAVANA")) {
                Assert.assertEquals(raybansDisplayPage.isColorFrameLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            } else if (listOfLabels.get(i).get("Labels").equals("sku_000001343585")) {
                Assert.assertEquals(raybansDisplayPage.isSkuLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            } else if (listOfLabels.get(i).get("Labels").equals("Colors")) {
                Assert.assertEquals(raybansDisplayPage.isColorsLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            } else if (listOfLabels.get(i).get("Labels").equals("Frame:")) {
                Assert.assertEquals(raybansDisplayPage.isFrameLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            } else if (listOfLabels.get(i).get("Labels").equals("$249.95")) {
                Assert.assertEquals(raybansDisplayPage.isPriceLabelDisplayed(), Boolean.valueOf(listOfLabels.get(i).get("isDisplayed")));
            }
        }
    }
}