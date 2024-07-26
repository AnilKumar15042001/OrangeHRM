Feature: My Info Page

  Background: 
  Given User logged in successfully
  
  Scenario: Personal Details page should be opened and enter valid personal details with all the fields
  When User clicked on My Info module 
  Then "Personal Details" page should be displayed
  When User edit first name as "Anil"
  And User edit middle name as "Kumar"
  And User edit last name as "Uttarkabat"
  And User edit employee id as "1504"
  And User edit other id as "35435434"
  And User edit driver license number as "35434376876876"
  And User edit license expiry date as year "2030" , month "June" and date "15"
  And User edit nationality as "Indian"
  And User edit marital status as "Married"
  And User edit date of birth as year "2000" , month "June" and date "22"
  And User edit gender as "Male"
  And User click on personal details save button
  Then User should be seen a sucessfully updated message 
  When User edit blood group as "B+"
  And User fill the test_field as "ddjvhjsjha"
  And User click on custom fields save button
  Then User should be seen a sucessfully updated message 
  When User click on attachments add button
  And User click on browse button
  And User upload his file
  And User enter the comments in comment text box field
  And User click on attachments save button
  Then User click on logout link and close the application
  
