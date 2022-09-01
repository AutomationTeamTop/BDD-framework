	Feature: As a user I want to login with username and password 
				 So that I can access my timesheets.

  @smoke
  Scenario: check the login functionality
   	Given Login page is loaded
   	When user enter username "admin" and Password "admin123"
   	Then user is navigated to the dashboard page
   	
   	
  @sanity	
  Scenario Outline: check the login functionality with multiple username and Password
  		Given Login page is loaded
   		When user enter username "<user>" and Password "<password>"
   		Then user is navigated to the dashboard page
    				
    Examples:
    
    	| user  |  password   |
    	|	Admin |	 admin123		|
    	|	Admin |  admin123   |
  
  

	