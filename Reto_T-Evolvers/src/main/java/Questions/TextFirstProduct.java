package Questions;

import Userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TextFirstProduct implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCartPage.FIRST_PRODUCT).viewedBy(actor).asString();
    }

    public static TextFirstProduct toTextfirstproduct(){
        return new TextFirstProduct();
    }
}
