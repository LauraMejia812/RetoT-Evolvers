package stepsdefinitions;

import Models.DressInformation;
import Questions.CheckLogo;
import Questions.ProductSuccessfullyAdded;
import Questions.TextFirstProduct;
import Questions.TextSecondProduct;
import Tasks.AddFirstProduct;
import Tasks.AddProductByName;
import Tasks.AddSecondProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class StepDefinitionAddToCart {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;


    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^The user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("http://automationpractice.com"));
    }

    @Then("^He looks at the logo My Store$")
    public void heLooksAtTheLogoMyStore() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckLogo.toChecklogo()));

    }

    @When("^the user adds both products to the shopping cart$")
    public void theUserAddsBothProductsToTheShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddFirstProduct.toAddFirstProduct());
        OnStage.theActorInTheSpotlight().attemptsTo(AddSecondProduct.toAddsecondproduct());
    }

    @Then("^he visualizes the first product (.*)$")
    public void heVisualizesTheFirstProduct(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextFirstProduct.toTextfirstproduct(), Matchers.is(Matchers.equalTo(message))));
    }

    @Then("^he visualize the second product (.*)$")
    public void heVisualizeTheSecondProduct(String messagetwo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextSecondProduct.toTextsecondproduct(), Matchers.is(Matchers.equalTo(messagetwo))));
    }


    @When("^the user searches for the product name and adds it to the shopping cart$")
    public void theUserSearchesForTheProductNameAndAddsItToTheShoppingCart(List<DressInformation> objDress) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductByName.toAddproductbyname(objDress.get(0)));
    }

    @Then("^the user views the product in the shopping cart section (.*)$")
    public void theUserViewsTheProductInTheShoppingCartSection(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ProductSuccessfullyAdded.toProductSuccessfully(),Matchers.is(Matchers.equalTo(message))));
    }

}
