
Feature: Customers


Background : Below are the common steps for every scenario
      Given User Launch Chrome browser
      When user opens url "https://admin-demo.nopcommerce.com/login" 
      And user enters email as "admin@yourstore.com" and password as "admin"
      And user clicks on Login button
      Then user can view dashboard

@sanity
Scenario: Add new Customer
      When user clicks on customers menu
      And clicks on customers item
      And clicks on add new button
      Then user can view add new customer page
      When user enters customer info
      And clicks on save button
      Then user can view confirmation message "The new customer has been added successfully."
      And close browser
      
@regression  
 Scenario: Search Customer By EmailID
           When user clicks on customers menu
           And clicks on Customer menu item
           And enters customer email
           When clicks on search button
           Then user should find email in the search table
           And close browser
      
 @regression     
 Scenario: Search Customer by Name
	When User click on customers Menu 
	And click on customers Menu Item 
	And Enter customer FirstName
	And Enter customer LastName
	When Click on search button
	Then User should found Name in the Search table
	And close browser 
	
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
