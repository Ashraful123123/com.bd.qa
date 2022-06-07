Feature: W3school search feature 

@SearchFieldW3school
Scenario: verify search feature 

	Given user visit wthree homepage 
	When user give keyword in search field
	When user click on search 
	Then user should redirect to that page
	
	