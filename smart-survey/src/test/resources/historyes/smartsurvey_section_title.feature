# language: en
@SmartSurveyTest
Feature: To test validation of a smartSurvey section title
 The system must validate the section title field
  
  Background: creates dependences
 
    Given that description is "TEST003"
 
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
      | 1                 |         |     
      
    Given that question is 
      | id                | description                  | 
      | 1                 | what is the weigth (ton) ?   |       
      
      
    Given that answer is
      | content            |   6            |
      | defaultAnswer      |   1            |
      
 
  Scenario: Verify section title
    Given the creation of a smartsurvey
    Then the message is "Section Title is mandatory"
    

  

  