# Author: karthi@your.domain.com
@regression 
Feature: Add Customer flow validation

Background:
    Given user launches demo telecom application
    And user click on add customer button

@Data
  Scenario: Add Customer
    When user enters all the fields
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by using 1 dim list
    When user enters all the fields by one dim list concep
      | karthi | rajan | rajan@gmail.com | tanjore | 767665453 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by using 1 dim map
    When user enters all the fields by one dim map concept
      | fname   | rajan            |
      | lname   | S                |
      | mail    | karthi@gmail.com |
      | address | selaiyur         |
      | phno    |      98768767645 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by using 2 dim list
    When user enters all the fields by two dim list concept
      | karthi   | rajan | rajan@gmail.com | tanjore | 767665453 |
      | java     | rajan | rajan@gmail.com | tanjore | 867665453 |
      | selenium | rajan | rajan@gmail.com | tanjore | 967665453 |
      | project  | rajan | rajan@gmail.com | tanjore | 667665453 |
    And user click on submit button
    Then user verify customer id is generated

@2DMap @reg @smoke
  Scenario: Add Customer validation by using 2 dim map
    When user enters all the fields by two dim map concept
      | fname    | lname | mail            | addr    | phno      |
      | karthi   | rajan | rajan@gmail.com | tanjore | 767665453 |
      | java     | rajan | rajan@gmail.com | tanjore | 867665453 |
      | selenium | rajan | rajan@gmail.com | tanjore | 967665453 |
      | project  | rajan | rajan@gmail.com | tanjore | 667665453 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario Outline: 
    When user enters all the fields "<fname>","<lname>","<mail>","<addr>","<phno>"
    And user click on submit button
    Then user verify customer id is generated

    Examples: 
      | fname    | lname | mail            | addr    | phno      |
      | karthi   | rajan | rajan@gmail.com | tanjore | 767665453 |
      | java     | rajan | rajan@gmail.com | tanjore | 867665453 |
      | selenium | rajan | rajan@gmail.com | tanjore | 967665453 |
      | project  | rajan | rajan@gmail.com | tanjore | 667665453 |
