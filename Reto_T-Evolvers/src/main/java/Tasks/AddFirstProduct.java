package Tasks;

import Interaction.Wait;
import Userinterfaces.HomePage;
import Userinterfaces.SectionDresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddFirstProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.DRESSES_BUTTON),
                Click.on(SectionDresses.FIRST_PRODUCT),
                Click.on(SectionDresses.ADD_TO_CART),
                Wait.just(2000),
                Click.on(SectionDresses.CONTINUE_SHOPPING_BUTTON),
                Wait.just(4000));
    }

    public static AddFirstProduct toAddFirstProduct(){
        return new AddFirstProduct();
    }
}
