package Userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {

    public static final Target FIRST_PRODUCT= Target.the("Capture text first product").locatedBy("//tr[@id='product_7_34_0_0']/td[2]/p/a");
    public static final Target SECOND_PRODUCT= Target.the("Capture text second product").locatedBy("//tr[@id='product_4_16_0_0']/td[2]/p/a");

}
