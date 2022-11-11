@zero
Feature: ZeroBank

  Scenario: As a User I should enter the "http://zero.webappsecurity.com/" web page with valid credentials and make some monetary process



    Given Launch Browser
    Given As a User I should navigate to "zeroBankUrl"
    Then As a User I should  click sign in button
    And   As a User I should enter username on login box
    And  As a User I should enter password on passwordbox
    And  As a User I should submit sign in button
#    this step you use driver.navigateBack()
    And  As a User I should click online banking link
    And  As a User I should click Pay Bills Link
    And  As a User I should click "Purchase Foreign Currency "button
    And  As a User I should Select Eurozone from "Currency"dropdown menu
    And As a User I should enter a number to "amount" box
    And As a User I should verify "US Dollars" that is not selected
    And As a User I should select "Selected currency" button
    And As a User I should click "Calculate Costs" button and click "purchase" button
    And As a User I should verify that "Foreign currency was successfully purchased." text visible successfully
    Then  close driver.