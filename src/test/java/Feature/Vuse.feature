@Vuse
Feature: Vuse Functionality 

Background: Common steps 
	Given launch url 
	And click accept cookie and age allow popup 
@addcart
Scenario: Verify search functionality 

	When search epod 
	And add to cart 
	Then proceed to checkout and verify 
@signin
Scenario: Verify sign in func. 

	When click sign in icon 
	And click with email to fill sign in form 
	Then verify sign in 
@login
Scenario: Verify login func. 
	When enter email and password 
	And click login button 
	Then verify display massage 
	