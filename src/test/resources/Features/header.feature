Feature: Feature to test header of amazon site

	Scenario Outline: Check search functionality of header
  
    Given user is on home page
    When user enter "<product_name>" in search box
    And clicks on search button
    Then user gets redirected to the searched product page
    When user clicks on select your location
  	And user enters "<pin_number>" in textbox
  	And clicks on Apply button
  	Then location is visible as text in header
    
  Examples:
  	| product_name  | pin_number  |
  	| Mobile Phones | 412210 | 
  	
  #Scenario Outline: Check choosing location using pin number
  
  	
  
  #Examples:
  #	| pin_number  |
  #	| 412210 |