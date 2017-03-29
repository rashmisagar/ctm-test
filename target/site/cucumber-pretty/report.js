$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ElectricityOnlyPriceCompare.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: rashmisagar.sen@bglgroup.co.uk"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    }
  ],
  "line": 19,
  "name": "Electricity Only Quote Results",
  "description": "As an Electricity Only user,\r\nI should be able to get quotes from companies that provide the products through the online journey,\r\nso that I can compare prices to make an optimal decision",
  "id": "electricity-only-quote-results",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Supplier details for Electricity Only Compare",
  "description": "",
  "id": "electricity-only-quote-results;supplier-details-for-electricity-only-compare",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I navigate to Home Page of the Energy journey",
  "keyword": "Given "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.I_navigate_to_Home_Page_of_the_Energy_journey()"
});
formatter.result({
  "duration": 16077981018,
  "status": "passed"
});
formatter.step({
  "line": 26,
  "name": "I am on the Supplier Tab",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.I_am_on_the_Supplier_Tab()"
});
formatter.result({
  "duration": 77148733,
  "status": "passed"
});
formatter.step({
  "line": 27,
  "name": "I enter postcode",
  "rows": [
    {
      "cells": [
        "postcode"
      ],
      "line": 28
    },
    {
      "cells": [
        "PE2 6YS"
      ],
      "line": 29
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.I_enter_postcode_as(DataTable)"
});
formatter.result({
  "duration": 807740252,
  "status": "passed"
});
formatter.step({
  "line": 30,
  "name": "I have my bill handy",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.I_have_my_bill_handy()"
});
formatter.result({
  "duration": 2272704964,
  "status": "passed"
});
formatter.step({
  "line": 31,
  "name": "I select to compare ElectricityOnly energy",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_to_compare_ElectricityOnly_energy()"
});
formatter.result({
  "duration": 301526571,
  "status": "passed"
});
formatter.step({
  "line": 32,
  "name": "I select my supplier",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_my_supplier()"
});
formatter.result({
  "duration": 4321471092,
  "status": "passed"
});
formatter.step({
  "line": 33,
  "name": "I click on Next button of Supplier page",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_click_on_Next_button_of_Supplier_page()"
});
formatter.result({
  "duration": 2261165871,
  "status": "passed"
});
formatter.step({
  "line": 34,
  "name": "I see Your Energy page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_see_Your_Energy_page_successfully()"
});
formatter.result({
  "duration": 5053502782,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Energy details for Electricity Only Compare",
  "description": "",
  "id": "electricity-only-quote-results;energy-details-for-electricity-only-compare",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "I am on the Energy page for Electricity Only",
  "keyword": "Given "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_am_on_the_Energy_page_for_Electricity_Only()"
});
formatter.result({
  "duration": 59564841,
  "status": "passed"
});
formatter.step({
  "line": 38,
  "name": "I select electricity tariff",
  "keyword": "When "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_electricity_tariff()"
});
formatter.result({
  "duration": 2160833051,
  "status": "passed"
});
formatter.step({
  "line": 39,
  "name": "I set economy7 meter as No",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_set_economy7_meter_as_No()"
});
formatter.result({
  "duration": 2214616216,
  "status": "passed"
});
formatter.step({
  "line": 40,
  "name": "I select electricity payment method",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_electricity_payment_method()"
});
formatter.result({
  "duration": 2177382184,
  "status": "passed"
});
formatter.step({
  "line": 41,
  "name": "I set electricity as main source of heating as Yes",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_set_electricity_as_main_source_of_heating_as_Yes()"
});
formatter.result({
  "duration": 2244882659,
  "status": "passed"
});
formatter.step({
  "line": 42,
  "name": "I select current electricity usage as kWh",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_current_electricity_usage_as_kWh()"
});
formatter.result({
  "duration": 2209878628,
  "status": "passed"
});
formatter.step({
  "line": 43,
  "name": "I enter value in usagefield",
  "rows": [
    {
      "cells": [
        "kwhspend"
      ],
      "line": 44
    },
    {
      "cells": [
        "3500"
      ],
      "line": 45
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_enter_value_in_usagefield(DataTable)"
});
formatter.result({
  "duration": 2333833140,
  "status": "passed"
});
formatter.step({
  "line": 46,
  "name": "I select Annually",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_Annually()"
});
formatter.result({
  "duration": 2207311794,
  "status": "passed"
});
formatter.step({
  "line": 47,
  "name": "I click on Next button of Electricity Energy page",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_click_on_Next_button_of_Electricity_Energy_page()"
});
formatter.result({
  "duration": 2259761156,
  "status": "passed"
});
formatter.step({
  "line": 48,
  "name": "I see Your Details page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_see_Your_Details_page_successfully()"
});
formatter.result({
  "duration": 4295930573,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Preferences and details for Electricity Only Compare",
  "description": "",
  "id": "electricity-only-quote-results;preferences-and-details-for-electricity-only-compare",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 51,
  "name": "I am on the Details Page",
  "keyword": "Given "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_am_on_the_Details_Page()"
});
formatter.result({
  "duration": 48335989,
  "status": "passed"
});
formatter.step({
  "line": 52,
  "name": "I select tariff type as Fixed Tariff",
  "keyword": "When "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_tariff_type_as_Fixed_Tariff()"
});
formatter.result({
  "duration": 2193620609,
  "status": "passed"
});
formatter.step({
  "line": 53,
  "name": "I select payment type as Monthly direct debit",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_payment_type_as_Monthly_direct_debit()"
});
formatter.result({
  "duration": 2279889022,
  "status": "passed"
});
formatter.step({
  "line": 54,
  "name": "I enter my email address",
  "rows": [
    {
      "cells": [
        "emailaddress"
      ],
      "line": 55
    },
    {
      "cells": [
        "rashmisagar.sen@bglgroup.co.uk"
      ],
      "line": 56
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_enter_my_email_address(DataTable)"
});
formatter.result({
  "duration": 2880927700,
  "status": "passed"
});
formatter.step({
  "line": 57,
  "name": "I select to agree with marketing terms",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_to_agree_with_marketing_terms()"
});
formatter.result({
  "duration": 2239480737,
  "status": "passed"
});
formatter.step({
  "line": 58,
  "name": "I select to have read Terms and Conditions",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_select_to_have_read_Terms_and_Conditions()"
});
formatter.result({
  "duration": 2265708450,
  "status": "passed"
});
formatter.step({
  "line": 59,
  "name": "I click Go to Prices button",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_click_Go_to_Prices_button()"
});
formatter.result({
  "duration": 9981260987,
  "status": "passed"
});
formatter.step({
  "line": 60,
  "name": "I should see the results loading popup",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_should_see_the_results_loading_popup()"
});
formatter.result({
  "duration": 165496460,
  "status": "passed"
});
formatter.step({
  "line": 61,
  "name": "I should see the results page successfully",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_should_see_the_results_page_successfully()"
});
formatter.result({
  "duration": 162682365,
  "status": "passed"
});
formatter.step({
  "line": 62,
  "name": "I should see the filters with quote results",
  "keyword": "And "
});
formatter.match({
  "location": "ElectricityOnlyTestSteps.i_should_see_the_filters_with_quote_results()"
});
formatter.result({
  "duration": 3889095665,
  "status": "passed"
});
});