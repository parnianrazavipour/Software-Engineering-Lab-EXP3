import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class MyStepdefs {
    private double operand1;
    private double operand2;
    private double result;
    private Exception exception;
    @Given("two operands {double} and {double}")
    public void twoOperandsOperandAndOperand(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @When("the operation {string} is performed")
    public void theOperationOperatorIsPerformed(String operator) {
        Calculator calculator = new Calculator();
        try {
            result = calculator.calculate(operand1, operand2, operator);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("the result should be {string}")
    public void theResultShouldBeResult(String expectedResult) {
        if ("error".equals(expectedResult)) {
            assertNotNull(exception);
        } else {
            assertNull(exception);
            assertEquals(Double.parseDouble(expectedResult), result, 0.0001);
        }
    }
}