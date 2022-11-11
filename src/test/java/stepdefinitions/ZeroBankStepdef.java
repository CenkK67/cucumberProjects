package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.ZeroBankPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ZeroBankStepdef {
    ZeroBankPage page=new ZeroBankPage();

    @Given("Launch Browser")
    public void launchBrowser() {
        Driver.getDriver();
    }
    @Given("As a User I should navigate to {string}")
    public void asAUserIShouldNavigateTo(String str) {

        Driver.getDriver().get(ConfigReader.getProperty("zeroBankUrl"));



    }


    @Then("As a User I should  click sign in button")
    public void asAUserIShouldClickSignInButton() {
        page.singInBtn.click();

    }

    @And("As a User I should enter username on login box")
    public void asAUserIShouldEnterUsernameOnLoginBox() {
        page.loginBox.sendKeys("username");

    }

    @And("As a User I should enter password on passwordbox")
    public void asAUserIShouldEnterPasswordOnPasswordbox() {
        page.passwordBox.sendKeys("password");


    }

    @And("As a User I should submit sign in button")
    public void asAUserIShouldSubmitSignInButton() {
        page.signInButton.click();
        Driver.getDriver().navigate().back();
    }

    @And("As a User I should click online banking link")
    public void asAUserIShouldClickOnlineBankingLink() {
        page.onlineBanking.click();
    }



    @And("As a User I should click Pay Bills Link")
    public void asAUserIShouldClickPayBillsLink() {
        page.paybillsLink.click();
    }

    @And("As a User I should click {string}button")
    public void asAUserIShouldClickButton(String arg0) {
        page.purchaseLink.click();
    }

    @And("As a User I should Select Eurozone from {string}dropdown menu")
    public void asAUserIShouldSelectEurozoneFromDropdownMenu(String arg0) {
        Select select =new Select(Driver.getDriver().findElement(By.name("currency")));

        select.selectByValue("EUR");

    }
    @Then("As a User I should enter a number to {string} box")
    public void as_a_User_I_should_enter_a_number_to_box(String string) {
        page.amauntBox.sendKeys("1000");

    }

    @Then("As a User I should verify {string} that is not selected")
    public void as_a_User_I_should_verify_that_is_not_selected(String string) {

        Assert.assertFalse(page.UsDollarsCheckbox.isSelected());

    }

    @Then("As a User I should select {string} button")
    public void as_a_User_I_should_select_button(String string) {
    page.selectedCurrency.click();

    }

    @Then("As a User I should click {string} button and click {string} button")
    public void as_a_User_I_should_click_button_and_click_button(String string, String string2) throws InterruptedException {
        page.calculatePost.click();
        Thread.sleep(1000);
        page.purchaseButton.click();

    }

    @Then("As a User I should verify that {string} text visible successfully")
    public void as_a_User_I_should_verify_that_text_visible_successfully(String string) {
        Assert.assertTrue(page.alertText.isDisplayed());

    }
    @Then("close driver.")
    public void closeDriver() {
        Driver.closeDriver();
    }

}
