@tag
Feature: Calculator operations
  Scenario Outline: Perform mathematical operations
    Given two operands <operand1> and <operand2>
    When the operation "<operator>" is performed
    Then the result should be "<result>"

    Examples:
      | operand1 | operand2 | operator | result |
      | 12       | 3        | +        | 15     |
      | 7        | 2        | -        | 5      |
      | 6        | 3        | *        | 18     |
      | 20       | 5        | /        | 4      |
      | 10       | 0        | /        | error  |
      | 0        | 5        | +        | 5      |
      | 0        | 0        | -        | 0      |
      | 1.5      | 2.5      | +        | 4.0    |
      | 100      | 50       | -        | 50     |
      | 5        | -3       | *        | -15    |
      | -4       | -2       | /        | 2      |
      | -7       | 3        | +        | -4     |
      | 2.5      | 0.5      | /        | 5      |
      | 1.1      | 0.9      | -        | 0.2    |
      | 3        | 3        | *        | 9      |