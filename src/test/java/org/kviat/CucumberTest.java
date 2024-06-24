package org.kviat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;
public class CucumberTest {
    private int a;
    private int b;
    private int result;

    @Given("I have two numbers {int} and {int}")
    public void given(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @When("I compare the numbers")
    public void when() {
        this.result = Integer.compare(a, b);
    }

    @Then("Then {int} will be 1, if the first number is bigger, -1, if the second number is bigger, 0, if the numbers are equal")
    public void then(int expected) {
        assertThat(this.result).isEqualTo(expected);
    }
}
