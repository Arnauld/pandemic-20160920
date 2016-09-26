package pandemic.feature.unit;

import cucumber.api.java.Before;
import pandemic.Network;

public class NetworkHook {

    private final CurrentNetwork currentNetwork;

    public NetworkHook(CurrentNetwork currentNetwork) {
        this.currentNetwork = currentNetwork;
    }

    @Before({"@occident_network"})
    public void defineOccidentNetwork() {
        System.out.println("NetworkHook.defineOccidentNetwork");
        Network network = new NetworkFactory().createOccident();
        currentNetwork.setNetwork(network);
    }
}
