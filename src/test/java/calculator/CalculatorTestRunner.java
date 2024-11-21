package calculator;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources")
@RunWith(Cucumber.class)
public class CalculatorTestRunner {
}