Feature: Standard Definition

  @standard @network
  Scenario: Occident Network definition -- Given case

    Given the occident sub-network
    Then the cities should have the following infection levels:
      | city    | level |
      | Paris   | 0     |
      | London  | 0     |
      | Essen   | 0     |
      | Algiers | 0     |
      | Madrid  | 0     |
    And Paris should be linked to: London, Madrid, Essen, Milan, Algiers


  @standard @network
  @occident_network
  Scenario: Occident Network definition -- Annotation case

    Then the cities should have the following infection levels:
      | city    | level |
      | Paris   | 0     |
      | London  | 0     |
      | Essen   | 0     |
      | Algiers | 0     |
      | Madrid  | 0     |
    And Paris should be linked to: London, Madrid, Essen, Milan, Algiers

