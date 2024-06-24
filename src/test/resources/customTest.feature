Feature: CheckComparison
  Scenario Outline: Checks, which number is bigger
    Given I have two numbers <a> and <b>
    When I compare the numbers
    Then Then <result> will be 1, if the first number is bigger, -1, if the second number is bigger, 0, if the numbers are equal

    Examples:
      | a | b | result |
      | 7 | 4 | 1      |
      | 2 | 6 | -1     |
      | 3 | 3 | 0      |
      | 5 | 5 | 0      |
      | 5 | 8 | -1     |
      | 9 | 1 | 1      |