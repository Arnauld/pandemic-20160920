package pandemic.feature.ui;

import pandemic.City;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class InfectionPageObject {
    private final Selenium selenium;

    public InfectionPageObject(Selenium selenium) {
        this.selenium = selenium;
    }

    public void infect(City city, int newLevel) {
        selenium.findBySelector("#city-" + city.name())
                .forEach(e -> e.setValue(String.valueOf(newLevel)));
    }

    public void infect(City city) {
        selenium.findBySelector("#city-" + city.name())
                .forEach(e -> e.setValue(increment(e.getValue())));
    }

    private static String increment(String value) {
        return String.valueOf(Integer.parseInt(value) + 1);
    }
}
