package pandemic.feature.unit;

import pandemic.City;
import pandemic.Network;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class NetworkFactory {

    public Network createOccident() {
        Network network = new Network();
        network.addLink(City.Paris, City.London);
        network.addLink(City.Paris, City.Essen);
        network.addLink(City.Paris, City.Milan);
        network.addLink(City.Paris, City.Algiers);
        network.addLink(City.Paris, City.Madrid);
        return network;
    }
}
