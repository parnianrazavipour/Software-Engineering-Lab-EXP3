import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("two operands <operand{double}> and <operand{double}>")
    public void twoOperandsOperandAndOperand(int operand1, int operand2) {
    }

    @When("the operation <operator> is performed")
    public void theOperationOperatorIsPerformed() {
    }

    @Then("the result should be <result>")
    public void theResultShouldBeResult() {
    }
}
