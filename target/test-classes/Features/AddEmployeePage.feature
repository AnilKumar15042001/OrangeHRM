Feature: Add Employee

  Background: 
    Given The user enter url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And The user is logged in with valid username as "Admin" and password as "admin123"

  Scenario Outline: Add a new employee
    When user click on PIM module
    And user click on AddEmployee button
    Then "Add Employee" page should be opened
    When user fill the textboxes "<first_name>" "<middle_name>" "<last_name>" "<employee_id>"
    And user click on save button
    Then customer details should be added successfully and page displayed as "Personal Details"
    When click on logout button
    And close the browser

    Examples: 
      | first_name | middle_name | last_name   | employee_id |
      | Anil       | Kumar       | Uttarakabat | 10011031 |
      #| Babu       | Prasad      | Uttarakabat | 100220 |
