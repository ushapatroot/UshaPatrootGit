package StepDefinitions;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features", glue={"StepDefinitions"}, monochrome = true,
plugin={"pretty","html:target/HtmlReports/r2.html",
		"json:target/JsonReports/r2.json",
		"junit:target/JUnitReports/r2.xml"},
tags="@googletest"
)
// plugin={"pretty","html:target/HtmlReports/r1.html"}
// plugin={"pretty","json:target/JsonReports/r1.json"}
// plugin={"pretty","junit:target/JUnitReports/r1.xml"}

public class TestRunner {

}
