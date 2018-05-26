# language: en
@SmartSurveyTest
Feature: To test inclusion of a smartSurvey
 The system must include a smartSurvey
  
  Background: creates dependences
 
    Given that description is "TEST001"
      
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
      | 1                 | cargo   |     
      
    Given that question is 
      | id                | description                  | 
      | 1                 | what is the weigth (ton) ?   |       
      
      
    Given that answer is
      | content            |   6            |
      | defaultAnswer      |   1            |
      
 
  Scenario: Verify inclusion
    Given the creation of a smartsurvey
    Then it is included successfully
    

  

  