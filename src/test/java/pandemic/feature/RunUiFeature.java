package pandemic.feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        tags = {"@ui"},
        glue = {"pandemic.feature.ui", "pandemic.feature.shared"}
)
public class RunUiFeature {
}
