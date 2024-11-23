package bdd;

public class Calculator {
    public double calculate(double operand1, double operand2, String operator) throws IllegalArgumentException {
        if (operator.equals("+")) {
            return operand1 + operand2;
        } else if (operator.equals("-")) {
            return operand1 - operand2;
        } else if (operator.equals("*")) {
            return operand1 * operand2;
        }else if (operator.equals("/")) {
            if (operand2 == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
            return operand1 / operand2;
        } else {
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
