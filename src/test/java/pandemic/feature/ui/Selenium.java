package pandemic.feature.ui;

import java.util.Collections;
import java.util.List;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class Selenium {
    public void stop() {

    }

    public Selenium start() {
        return this;
    }

    public List<HTMLElement> findBySelector(String selector) {
        return Collections.emptyList();
    }

    public interface HTMLElement {
        void setValue(String value);

        String getValue();
    }
}
