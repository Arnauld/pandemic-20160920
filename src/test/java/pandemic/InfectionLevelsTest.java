package pandemic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InfectionLevelsTest {

    @Test
    public void should_have_an_infection_level_defined_to_zero_by_default() {
        InfectionLevels infectionLevels = new InfectionLevels();

        assertThat(infectionLevels.levelOf(City.Paris)).isEqualTo(0);
    }

    @Test
    public void should_increase_infection_level_specified_city() {
        InfectionLevels infectionLevels = new InfectionLevels();

        infectionLevels.infect(City.Paris);
        assertThat(infectionLevels.levelOf(City.Paris)).isEqualTo(1);

        infectionLevels.infect(City.Paris);
        assertThat(infectionLevels.levelOf(City.Paris)).isEqualTo(2);

        infectionLevels.infect(City.Paris);
        assertThat(infectionLevels.levelOf(City.Paris)).isEqualTo(3);
    }

    @Test
    public void should_increase_infection_level_only_for_the_specified_city() {
        InfectionLevels infectionLevels = new InfectionLevels();

        infectionLevels.infect(City.Paris);
        assertThat(infectionLevels.levelOf(City.Algiers)).isEqualTo(0);

        infectionLevels.infect(City.Algiers);
        assertThat(infectionLevels.levelOf(City.Paris)).isEqualTo(1);
        assertThat(infectionLevels.levelOf(City.Algiers)).isEqualTo(1);
        assertThat(infectionLevels.levelOf(City.NewYork)).isEqualTo(0);

        infectionLevels.infect(City.Paris);
        assertThat(infectionLevels.levelOf(City.Paris)).isEqualTo(2);
        assertThat(infectionLevels.levelOf(City.Algiers)).isEqualTo(1);
        assertThat(infectionLevels.levelOf(City.NewYork)).isEqualTo(0);
    }
}