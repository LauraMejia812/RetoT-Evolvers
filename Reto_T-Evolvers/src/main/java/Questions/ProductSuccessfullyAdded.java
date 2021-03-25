package Questions;

import Userinterfaces.SectionDresses;
import Userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductSuccessfullyAdded implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SectionDresses.TEXT_ADD_SUCCESSFULLY).viewedBy(actor).asString();
    }

    public static ProductSuccessfullyAdded toProductSuccessfully() {
    return new ProductSuccessfullyAdded();
    }

}
