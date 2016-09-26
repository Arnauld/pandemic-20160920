package pandemic.feature.ui;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SeleniumHook {

    private final CurrentSelenium server;

    public SeleniumHook(CurrentSelenium server) {
        this.server = server;
    }

    @Before
    public void startSelenium() {
        server.setSelenium(new Selenium().start());
    }

    @After
    public void stopSelenium() {
        server.getSelenium().stop();
    }
}
