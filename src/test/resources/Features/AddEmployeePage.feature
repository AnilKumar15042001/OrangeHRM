Feature: Add Employee

  Background: 
    Given user launch the chrome browser
    When user enter url "http://example.com"
    And user enter username as "admin"
    And user enter password as "password123"
    And click on OrangeHrm login button
    Then page title should be displayed as "OrangeHRM"

  Scenario Outline: Add a new employee
    When user click on PIM module
    And user click on AddEmployee button
    Then "PIM : Add Employee" page should be opened
    When user fill the textboxes "<first_name>" "<middle_name>" "<last_name>" "<employee_id>"
    And user click on save button
    Then customer details should be added successfully and page displayed as "Personal Details"
    When click on logout button
    And close the browser

    Examples: 
      | first_name | middle_name | last_name   | employee_id |
      | Anil       | Kumar       | Uttarakabat |        1001 |
      | Babu       | Prasad      | Uttarakabat |        1002 |
