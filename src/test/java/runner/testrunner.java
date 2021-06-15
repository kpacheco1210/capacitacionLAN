package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Lan/test.feature",
        glue = "selenium",
        tags = {"@PrimerTest,@SegundoTest"},
        plugin = {}
)

public class testrunner {

}

// Orquesta las pruebas. Es el rey



