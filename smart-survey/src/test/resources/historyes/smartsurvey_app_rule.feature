# language: en
@SmartSurveyTest
Feature: To test validation of a smartSurvey app rules
 The system must validate the app rules
  
  Background: creates dependences
 
    Given that description is "TEST005"
 
    Given that organization is 
      | description                | key           | 
      | GM-BRUNOSILVA              | GM-BRUNOSILVA | 
      
    Given that section is 
      | id                | title   | 
      | 1                 |  cargo  |     
 
     Given that question is 
      | id                | description                  | 
      | 1                 | what is the weigth (ton) ?   |       
      
    Given that answer is
      | content            |   6            |
      | defaultAnswer      |   1            |
           
 
  Scenario: Verify app rules
    Given the creation of a smartsurvey
    Then the message is "It is mandatory to add at least one Application Rule"
    

  

  