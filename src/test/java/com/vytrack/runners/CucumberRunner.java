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
        tags = "@create_calendar_event_2", // tags = "not @driver" --> run everything
        plugin = {
                "html:target/default-report",
                "json:target/cucumber.json"
        }

)
public class CucumberRunner {


}
