Feature: Login

Scenario: Successful Login with valid Credentials
     Given User Launch Chrome browser
     When User opens URL "https://demo.nopcommerce.com/login?returnUrl=%2F"
     And User enters Email as "test34567@gmail.com" and password as "amazonbusiness_2024"
     And Click on Login
     Then Page Title should be "Dashboard / nopCommervce administration"
     When User clicks on Log out link
     Then Page Tile should be "Your store. Login"
     And close browser

  Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
     When User opens URL "https://demo.nopcommerce.com/login?returnUrl=%2F"
     And User enters Email as "<email>" and password as "<password>"
     And Click on Login
     Then Page Title should be "Dashboard / nopCommervce administration"
     When User clicks on Log out link
     Then Page Tile should be "Your store. Login"
     And close browser
  
     Examples: 
     | email | password | 
     |  test523@gmail.com     |   12345       | 
     |   test5648@gmail.com    |   amazonbusiness_2024       |
  