package starter.stepdefinitions;

import io.cucumber.core.cli.Main;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;
import starter.register.DoRegister;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegisterStepDefinitions {

    String names;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has not an active account")
    public void has_not_an_active_account(String name) {
        this.names = name;
    }

    @When("he sends their valid information")
    public void he_sends_their_valid_information() {
        theActorCalled(names).attemptsTo(
                NavigateTo.theDuckDuckGoHomePage(),
                DoRegister.withcredencials("angelamunoz92+98@gmail.com","Mrs.","Angela","Garcia","12345678","Google","Ave 45 67-78","Ave 45 67-89","Dalas","Alabama","000000", "United State","23423424342", "343434234")
        );
    }

    @Then("he should have access to login in his account")
    public void heShouldHaveAccessToLoginInHisAccount() {
    }
}
