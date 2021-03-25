package Tasks;

import Userinterfaces.HomePage;
import Userinterfaces.SectionDresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddSecondProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SectionDresses.SECOND_PRODUCT),
                Click.on(SectionDresses.ADD_TO_CART_TWO),
                Click.on(SectionDresses.PROCEED_TO_CHECKOUT));
    }

    public static AddSecondProduct toAddsecondproduct(){
        return new AddSecondProduct();
    }
}
