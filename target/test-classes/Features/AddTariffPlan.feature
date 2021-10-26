@reg
Feature: Add Tariff Plan 
 
  Scenario: AddTarficplan
    Given user launch demo telecom webpages
    And user click on addtarficplan button
    When user click the all fileds by using one dim map
      | rental          | 1 |
      | local_minutes   | 2 |
      | inter_minutes   | 3 |
      | sms_pac         | 4 |
      | minutes_charges | 5 |
      | inter_charges   | 6 |
      | sms_charges     | 2 |
    And user click the submit butto
    