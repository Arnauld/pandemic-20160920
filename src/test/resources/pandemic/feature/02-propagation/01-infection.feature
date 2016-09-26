Feature: Infect a city

  @infection @ui @jira1254
  Scenario: Infect a city

    Given Paris infection level has been set to 2
    When Paris is infected
    Then Paris infection level should be increased to 3

  @infection @ui @wip @alo @variant
  Scenario: Infect a city should not impact the neighbour

    Given Paris infection level has been set to 2
    When Paris is infected
    Then London infection level should be increased to 0


  @infection @ui @wip
  Scenario: Infect a city up to 3 trigger an outbreak

    Given Paris infection level has been set to 3
    When Paris is infected
    Then Paris infection level should be stay to 3
    And an outbreak should be triggered