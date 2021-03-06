package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features/add_to_cart.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "stepsdefinitions",
        tags = "@FilterByProductName")
public class RunnerAddToCart {
}
