package pandemic.feature.unit;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pandemic.City;
import pandemic.Network;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class CitySteps {

    private final CurrentNetwork currentNetwork;
    private Scenario scenario;

    public CitySteps(CurrentNetwork currentNetwork) {
        this.currentNetwork = currentNetwork;
    }

    @Before()
    public void injectScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^the occident sub-network$")
    public void the_occident_sub_network() throws Throwable {
        Network network = new NetworkFactory().createOccident();
        currentNetwork.setNetwork(network);
        scenario.write("Zog Zog!");
    }

    @Then("^(.*) should be linked to: (.*)$")
    public void city_should_be_linked_to(City city, String expectedCommaSeparatedCities) throws Throwable {
        List<City> expectedCities = parseCities(expectedCommaSeparatedCities);

        List<City> links = currentNetwork.getNetwork().linkedTo(city);
        assertThat(links).containsAll(expectedCities);
        assertThat(expectedCities).containsAll(links);
    }

    private static List<City> parseCities(String commaSeparatedCities) {
        return Stream.of(commaSeparatedCities.split(","))
                .map(String::trim)
                .map(City::valueOf)
                .collect(Collectors.toList());
    }

}
