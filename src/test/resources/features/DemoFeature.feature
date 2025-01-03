Feature: My first demo feature

  Scenario: My first demo test
    Given I open a site
    When I fill "Минск" into form
    Then I see greeting message

  Scenario: My second demo test
    Given I open a site
    When I fill "Москва" into form
    Then I see greeting message

  Scenario: My third demo test
    Given I open a site
    When I fill "Варшава" into form
    Then I see greeting message