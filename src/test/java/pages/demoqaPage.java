package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoqaPage extends BasePage {

    @FindBy(xpath = "//*[text()='Elements']")
    public WebElement elementLink;
    @FindBy(xpath = "//*[text()='Text Box']")
    public WebElement textboxLink;



}
