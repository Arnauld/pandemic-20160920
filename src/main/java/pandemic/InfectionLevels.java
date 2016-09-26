package pandemic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class InfectionLevels {

    private final Map<City, Integer> levels = new HashMap<>();

    public int levelOf(City city) {
        return levels.getOrDefault(city, 0);
    }

    public void setLevel(City city, int level) {
        levels.put(city, level);
    }

    public void infect(City city) {
        int level = levelOf(city);
        setLevel(city, level + 1);
    }
}
