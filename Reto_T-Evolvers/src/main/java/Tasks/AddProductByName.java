package Tasks;

import Interaction.Wait;
import Models.DressInformation;
import Userinterfaces.HomePage;
import Userinterfaces.SectionDresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class AddProductByName implements Task {

    private DressInformation objDress;

    public AddProductByName(DressInformation objDress) {
        this.objDress = objDress;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(objDress.getProductName()).into(HomePage.SEARCH_FIELD),
                Click.on(HomePage.BUTTON_SEARCH),
                Click.on(SectionDresses.SECOND_PRODUCT),
                Click.on(SectionDresses.BUTTON_MORE),
                Wait.just(1000),
                Enter.theValue(objDress.getQuantity()).into(SectionDresses.QUANTITY_FIELD),
                Click.on(SectionDresses.BUTTON_SIZE),
                Click.on(SectionDresses.SELECT_SIZE),
                Click.on(SectionDresses.BUTTON_ADD_TO_CART),
                Wait.just(1000));
    }

    public static AddProductByName toAddproductbyname(DressInformation objDress){
        return Tasks.instrumented(AddProductByName.class,objDress);
    }
}
