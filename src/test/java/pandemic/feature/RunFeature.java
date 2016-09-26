package pandemic.feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        tags = {"~@wip"},
        glue = {"pandemic.feature.unit", "pandemic.feature.shared"},
        plugin = {"pretty", "html:target/cucumber", "pandemic.feature.shared.CustomReporter"}

)

public class RunFeature {
}
