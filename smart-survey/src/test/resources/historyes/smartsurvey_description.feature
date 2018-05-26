# language: en
@SmartSurveyTest
Feature: To test validation of a smartSurvey description
 The system must validate the description field
  
  Background: creates dependences
 
    Given that description is ""
      
    Given that organization is 
      | description                | key           | 
      | GM-BRUNOSILVA              | GM-BRUNOSILVA | 
      
    Given that triggerEvent is 
      | id                | description | 
      | 1                 | start route | 
      
    Given that conditionable is
      | id                | description   | enabled |
      | 1                 | Location Type |    1    |
      
    Given that condition is 
      | id                | conditionType | conditionableType | 
      | 1                 | equals to     |         1         |      
      
    Given that section is 
      | id                | title   | 
      | 1                 | cargo         |     
      
    Given that question is 
      | id                | description                  | 
      | 1                 | what is the weigth (ton) ?   |       
      
      
    Given that answer is
      | content            |   6            |
      | defaultAnswer      |   1            |
      
 
  Scenario: Verify description
    Given the creation of a smartsurvey
    Then the message is "Description is mandatory"
    

  

  