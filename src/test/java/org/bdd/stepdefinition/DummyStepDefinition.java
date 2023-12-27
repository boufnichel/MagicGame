package org.bdd.stepdefinition;



import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DummyStepDefinition {


  @Given("some conditions")
  public void someConditions() {

  }

  @When("some actions")
  public void someActions() {
  }

  @Then("some result")
  public void theResultIs() throws Throwable {
    assertThat(false).isTrue();
  }
}


