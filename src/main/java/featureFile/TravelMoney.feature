@commbank
Feature:  Validate Commbank landing page

  Scenario:
    Given User navigates to Commbank Homepage
    And   Validate the navigation to Travel money overseas section
    When  Subtopics exists in section
    And   validate NetBank Details
    Then  validate Netbank User Details
