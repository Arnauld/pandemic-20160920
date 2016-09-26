package pandemic.feature.ui;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pandemic.City;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class UiSteps {

    private final CurrentSelenium currentSelenium;

    public UiSteps(CurrentSelenium currentSelenium) {
        this.currentSelenium = currentSelenium;
    }


    @Given("^(.*) infection level has been set to (\\d+)$")
    public void city_infection_level_has_been_set_to(City city, int newLevel) throws Throwable {
        new InfectionPageObject(currentSelenium.getSelenium()).infect(city, newLevel);
    }

    @When("^(.*) is infected$")
    public void city_is_infected(City city) throws Throwable {
        new InfectionPageObject(currentSelenium.getSelenium()).infect(city);
    }

    @Then("^(.*) infection level should be increased to (\\d+)$")
    public void city_infection_level_should_be_increased_to(City city, int expectedLevel) throws Throwable {
        throw new PendingException("Not implemented yet");
    }
}
