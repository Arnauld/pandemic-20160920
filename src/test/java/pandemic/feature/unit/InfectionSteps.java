package pandemic.feature.unit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.fr.Etantdonné;
import org.assertj.core.api.SoftAssertions;
import pandemic.City;
import pandemic.InfectionLevels;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InfectionSteps {

    private final CurrentNetwork currentNetwork;
    private final CurrentInfectionLevels currentLevels;

    public InfectionSteps(CurrentNetwork currentNetwork, CurrentInfectionLevels currentLevels) {
        this.currentNetwork = currentNetwork;
        this.currentLevels = currentLevels;
    }

    @Then("^the cities should have the following infection levels:$")
    public void the_cities_should_have_the_following_infection_levels(List<CityInfectionLevelProto> protoss) throws Throwable {
        InfectionLevels infectionLevels = currentLevels.getInfectionLevels();

        SoftAssertions assertions = new SoftAssertions();
        for (CityInfectionLevelProto proto : protoss) {
            assertions.assertThat(infectionLevels.levelOf(proto.city))
                    .isEqualTo(proto.level);
        }
        assertions.assertAll();
    }

    @Given("^(.*) infection level has been set to (\\d+)$")
    public void define_infection_level_has_been_set_to(City city, int level) throws Throwable {
        currentLevels.getInfectionLevels().setLevel(city, level);
    }

    @Etantdonné("^(.*) niveau d'infection définit à (\\d+)$")
    public void fr_define_infection_level_has_been_set_to(City city, int level) throws Throwable {
        define_infection_level_has_been_set_to(city, level);
    }

    @When("^(.*) is infected$")
    public void city_is_infected(City city) throws Throwable {
        currentLevels.getInfectionLevels().infect(city);
    }

    @Then("^(.*) infection level should be increased to (\\d+)$")
    public void city_infection_level_should_be_increased_to(City city, int level) throws Throwable {
        assertThat(currentLevels.getInfectionLevels().levelOf(city)).isEqualTo(level);
    }

    public static class CityInfectionLevelProto {
        public City city;
        public int level;
    }
}
