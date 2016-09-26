package pandemic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NetworkTest {

    @Test
    public void should_return_cities_linked_to_a_known_city() {
        Network network = new Network();
        network.addLink(City.Paris, City.Algiers);
        network.addLink(City.Paris, City.London);

        // contains only the given values and nothing else, in any order
        assertThat(network.linkedTo(City.Paris)).containsOnly(City.Algiers, City.London);
    }

    @Test
    public void should_return_no_cities_linked_to_an_unknown_city() {
        Network network = new Network();
        network.addLink(City.Paris, City.Algiers);
        network.addLink(City.Paris, City.London);

        assertThat(network.linkedTo(City.NewYork)).isEmpty();
    }
}