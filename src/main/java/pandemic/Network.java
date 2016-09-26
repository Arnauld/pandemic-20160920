package pandemic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Network {

    private final List<Link> links = new ArrayList<>();

    public void addLink(City city1, City city2) {
        links.add(new Link(city1, city2));
    }

    public List<City> linkedTo(City city) {
        return links.stream()
                .filter(l -> l.contains(city))
                .map(l -> l.other(city))
                .collect(Collectors.toList());
    }

    private static class Link {
        public final City city1;
        public final City city2;

        private Link(City city1, City city2) {
            this.city1 = city1;
            this.city2 = city2;
        }

        public boolean contains(City city) {
            return city == city1 || city == city2;
        }

        public City other(City city) {
            if (city == city1)
                return city2;
            else if (city == city2)
                return city1;
            throw new IllegalArgumentException("City not linked " + city);
        }
    }
}
