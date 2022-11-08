package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.demoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class demoqaStepdef {

    demoqaPage page=new demoqaPage();
    Actions action =new Actions(Driver.getDriver());



    @Given("User goes  to {string}")
    public void userGoesTo(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));


    }

    @And("user clicks element link")
    public void userClicksElementLink() throws InterruptedException {
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        page.elementLink.click();


    }

    @And("user clicks textbox link")
    public void userClicksTextboxLink() {
        page.textboxLink.click();
    }

    @Then("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }


}
