Feature: Electricity Only Quote Results
  As a Electricity Only user,
  I should be able to get quotes from companies that provide the products through the online journey,
  so that I can compare prices to make an optimal decision

  Scenario: Energy from same supplier
    Given I am on the Home Page of the Energy journey
    And I am on the Supplier Tab
    When I enter postcode as "PE2 6YS"
    And I have my bill handy
    And I want to compare ElectricityOnly energy
    And I get my energy supply from supplier as "eon"
    Then I click on Next
    And I see Your Energy page successfully