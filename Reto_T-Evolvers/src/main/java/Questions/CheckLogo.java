package Questions;

import Userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class CheckLogo implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(HomePage.MY_STORE_ICON).viewedBy(actor).asBoolean();
    }

    public static CheckLogo toChecklogo(){
        return new CheckLogo();
    }


}
