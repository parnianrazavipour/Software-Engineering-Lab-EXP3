package bdd;

public class Calculator {
    public double calculate(double operand1, double operand2, String operator) throws IllegalArgumentException {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
