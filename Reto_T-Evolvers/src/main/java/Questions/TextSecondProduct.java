package Questions;

import Userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextSecondProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.SECOND_PRODUCT).viewedBy(actor).asString();
    }

    public static TextSecondProduct toTextsecondproduct(){
        return new TextSecondProduct();
    }
}
