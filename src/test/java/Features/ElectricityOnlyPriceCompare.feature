#Author: rashmisagar.sen@bglgroup.co.uk
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)

Feature: Electricity Only Quote Results
  As an Electricity Only user,
  I should be able to get quotes from companies that provide the products through the online journey,
  so that I can compare prices to make an optimal decision

  Scenario: Fill Supplier details for Electricity Only Compare
    Given I navigate to Home Page of the Energy journey
    And I am on the Supplier Tab
    When I enter postcode
      |postcode|
      |PE2 6YS |
    And I have my bill handy
    And I select to compare ElectricityOnly energy
    And I select my supplier
    And I click on Next button of Supplier page
    Then I see Your Energy page successfully

  Scenario: Fill Energy details for Electricity Only Compare
    Given I am on the Energy page for Electricity Only
    When I select electricity tariff
    And I set economy7 meter as No
    And I select electricity payment method
    And I set electricity as main source of heating as Yes
    And I select current electricity usage as kWh
    And I enter value in usagefield
      |kwhspend|
      |3500|
    And I select Annually
    And I click on Next button of Electricity Energy page
    Then I see Your Details page successfully

  Scenario: Fill Preferences and details for Electricity Only Compare
    Given I am on the Details Page
    When I select tariff type as Fixed Tariff
    And I select payment type as Monthly direct debit
    And I enter my email address
      |emailaddress|
      |rashmisagar.sen@bglgroup.co.uk|
    And I select to agree with marketing terms
    And I select to have read Terms and Conditions
    And I click Go to Prices button
    Then I should see the results loading popup
    And I should see the results page successfully
    And I should see the filters with quote results