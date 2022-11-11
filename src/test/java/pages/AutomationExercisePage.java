package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class AutomationExercisePage extends BasePage {

    @FindBy(css=".logo.pull-left")
    public WebElement autExercisePicture;
    @FindBy(xpath = "*[text()=' Products']")
    public WebElement productsLink;



}
