package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZeroBankPage extends BasePage {


          @FindBy(id="signin_button")
          public WebElement singInBtn;
          @FindBy(id="user_login")
          public WebElement loginBox;
          @FindBy(id="user_password")
          public WebElement passwordBox;
          @FindBy(id="user_remember_me")
          public WebElement rememberCheckbox;
          @FindBy(name="submit")
          public WebElement signInButton;
          @FindBy(id="onlineBankingMenu")
          public WebElement onlineBanking;
          @FindBy(id="pay_bills_link")
          public  WebElement paybillsLink;
          @FindBy(linkText = "Purchase Foreign Currency")
          public WebElement purchaseLink;
          @FindBy(id="pc_amount")
          public WebElement amauntBox;
          @FindBy(id="pc_inDollars_true")
          public WebElement UsDollarsCheckbox;
          @FindBy(id="pc_inDollars_false")
          public WebElement selectedCurrency;
          @FindBy(id="pc_calculate_costs")
          public WebElement calculatePost;
          @FindBy(id="purchase_cash")
          public WebElement purchaseButton;
          @FindBy(id="alert_content")
          public WebElement alertText;





}
