# language: en
@SmartSurveyTest
Feature: To test validation of a smartSurvey section question
 The system must validate the section question field
  
  Background: creates dependences
 
    Given that description is "TEST004"
 
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
      | 1                 |  cargo  |     
      
 
  Scenario: Verify section questions
    Given the creation of a smartsurvey
    Then the message is "Section Questions are mandatory"
    

  

  