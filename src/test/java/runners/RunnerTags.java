package runners;

import cucumber.api.SnippetType;
//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/choucairTest.feature",//demo.feature",
        tags="@stories",
        glue="co.com.choucair.certifation.test.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class RunnerTags {


}