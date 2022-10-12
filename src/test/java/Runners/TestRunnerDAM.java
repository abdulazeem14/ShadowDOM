package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/DAMWebUIDemo.feature"},
        glue = {"src/test/java/StepClass"},
        dryRun = false,
        strict = true)


public class TestRunnerDAM {
}
