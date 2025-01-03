package classwork.day17;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"steps.DemoSteps"},
        features = {"src/test/resources/features/demo/jdemo.feature"},
        tags = "@QA"
)
public class DemoRunner {
}
