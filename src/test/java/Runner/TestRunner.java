package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import Pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources",
plugin = {"pretty","html:target/cucumber-reports.html"},
glue = "Steps",
tags = "@Schools"
)

public class TestRunner {
    //acción a realizar postrunner, cerrar navegador para no dejar proceso abierto
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }  
}
