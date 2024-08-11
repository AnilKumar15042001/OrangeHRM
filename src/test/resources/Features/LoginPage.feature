Feature: Login

  Background: 
    Given User launch the chrome browser
    When User enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  #Scenario: User login with valid credentials
    #When User enter valid username as "Admin"
    #And User enter valid password as "admin123"
    #And User click on login button
    #Then User should be logged in successfully
    #When User click on logout link
    #Then User close the browser

  Scenario: User login with invalid credentials
    When User enter valid username as "<Username>"
    And User enter valid password as "<Password>"
    And User click on login button
    But User should be logged in successfully with invalid details
    Then User should see an error message
    
    Examples:
    | Username | Password |
    | Admin | Admin123 |
    | admin | admin123 |
    | admin | Admin123 |
    | Admin | |
    | | admin123 |
    | 987654321 | 123456789 |
    | !@$%^&* | admin123 |
    | !@$%^&* | !@$%^&* |
    | Admin | !@$%^&* |
    | ADMIN | admin123 |
    | ADmin | admin123 |
    | ADMin | admin123 |
    | ADMIn | admin123 |
    | Admin | aDMIN123 |
    | Admin | adMIN123 |
    | Admin | admIN123 |
    | Admin | admiN123 |
    | Admin | ADMIN123 |
    
    
    
    
