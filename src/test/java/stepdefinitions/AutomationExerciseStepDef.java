//package stepdefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import pages.AutomationExercisePage;
//import utilities.ConfigReader;
//import utilities.Driver;
//
//public class AutomationExerciseStepDef {
//
//    AutomationExercisePage page=new AutomationExercisePage();
//    Actions action=new Actions(Driver.getDriver());
//
//    @Given("Launch browser")
//    public void launchBrowser() {
//        Driver.getDriver();
//    }
//
//    @Then("Navigate to url {string}")
//    public void navigateToUrlHttpAutomationexerciseCom(String str) {
//        Driver.getDriver().get(ConfigReader.getProperty("AutomationUrl"));
//
//
//
//    }
//    @Then("Verify that home page is visible successfully")
//    public void verify_that_home_page_is_visible_successfully() {
//        Assert.assertTrue(page.autExercisePicture.isDisplayed());
//    }
//
//
//
//    @Then("Add products to cart")
//    public void add_products_to_cart() {
//        page.productsLink.click();
//        action.sendKeys(Keys.PAGE_DOWN).build().perform();
//
//
//    }
//
//
//
//    @Then("Click {string} button")
//    public void click_button(String string) {
//
//    }
//
//
//
//    @Then("Verify that cart page is displayed")
//    public void verify_that_cart_page_is_displayed() {
//
//    }
//
//
//
//    @Then("Click Proceed To Checkout")
//    public void click_Proceed_To_Checkout() {
//
//    }
//
//
//
//    @Then("Click {string} button")
//    public void click_button(String string) {
//
//    }
//
//
//
//    @Then("Fill all details in Signup and create account")
//    public void fill_all_details_in_Signup_and_create_account() {
//
//    }
//
//
//
//    @Then("Verify {string} and click {string} button")
//    public void verify_and_click_button(String string, String string2) {
//
//    }
//
//
//
//    @Then("Verify {string} at top")
//    public void verify_at_top(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Then("Click {string} button")
//    public void click_button(String string) {
//
//    }
//
//
//
//    @Then("Clicks {string} button")
//    public void clicks_button(String string) {
//
//    }
//
//
//
//    @Then("Verify Address Details and Review Your Order")
//    public void verify_Address_Details_and_Review_Your_Order() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//
//
//    @Then("Enter description in comment text area and click {string}")
//    public void enter_description_in_comment_text_area_and_click(String string) {
//
//    }
//
//
//
//    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
//    public void enter_payment_details_Name_on_Card_Card_Number_CVC_Expiration_date() {
//
//    }
//
//
//
//    @Then("Clicks {string} button")
//    public void clicks_button(String string) {
//
//    }
//
//
//
//    @Then("Verify success message {string}")
//    public void verify_success_message(String string) {
//
//    }
//
//
//
//    @Then("Click {string} button and verify invoice is downloaded successfully.")
//    public void click_button_and_verify_invoice_is_downloaded_successfully(String string) {
//
//    }
//
//
//
//    @Then("Click {string} button")
//    public void click_button(String string) {
//
//    }
//
//
//
//    @Then("Click {string} button")
//    public void click_button(String string) {
//
//    }
//
//
//
//    @Then("Verify {string} and click {string} button")
//    public void verify_and_click_button(String string, String string2) {
//
//    }
//
//}
