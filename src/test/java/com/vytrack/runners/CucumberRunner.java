package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features",
        dryRun = false,
        strict = false,
        // only run which scenario has this tags
        tags = "", // tags = "not @driver" --> run everything
        plugin = "html:target/cucumber-html-report"

)
public class CucumberRunner {


}
