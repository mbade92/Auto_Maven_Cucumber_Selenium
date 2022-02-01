package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/",
        glue = "src/StepDefinitions",
        //format= ("pretty","html:test-output")
        plugin = {
                "summary"
}
)

public class TestRunner {
}
