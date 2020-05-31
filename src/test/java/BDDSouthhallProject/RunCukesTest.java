package BDDSouthhallProject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Runner class
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/Homepage.feature",
        tags = {"@smoke"} ,
        plugin = {"html:target/cucumber-html-report"})

public class RunCukesTest {

}
//please add some assertion
//vipul bhesania
//vipul
//I have added assetion please check
//Git pull demo
//Build trigger job
