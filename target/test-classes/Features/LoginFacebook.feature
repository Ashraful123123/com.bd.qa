Feature: Search Function 
@coffee
Scenario: Verify user can login with valid credential 

	Given user visit facebook homepage 
	When  user give username and password 
	When  user click on login 
	Then  user should be able to login in facebook 
	
@coffeOne
Scenario: Verify Wthree school Logo 
	Given user visit facebook homepage 
	Then  verify Wthree school logo 
	
	
