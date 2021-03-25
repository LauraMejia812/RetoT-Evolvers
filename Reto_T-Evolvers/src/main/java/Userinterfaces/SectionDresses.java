package Userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SectionDresses {
    public static final Target FIRST_PRODUCT= Target.the("Select first product").locatedBy("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]");
    public static final Target SECOND_PRODUCT= Target.the("Select second product").locatedBy("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]");
    public static final Target ADD_TO_CART= Target.the("Select button add to cart").locatedBy("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]");
    public static final Target CONTINUE_SHOPPING_BUTTON= Target.the("select button to continue buying").locatedBy("//span[@class='continue btn btn-default button exclusive-medium']/span");
    public static final Target ADD_TO_CART_TWO= Target.the("select button add two").locatedBy("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/div[2]");
    public static final Target PROCEED_TO_CHECKOUT= Target.the("proceed to checkout").locatedBy("//a[@class='btn btn-default button button-medium']");
    public static final Target BUTTON_MORE= Target.the("Click in the button more").locatedBy("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/div[2]/a[2]");
    public static final Target QUANTITY_FIELD= Target.the("enter text in quantity field").located(By.id("quantity_wanted"));
    public static final Target BUTTON_SIZE= Target.the("click button size").locatedBy("//select[@id='group_1']");
    public static final Target SELECT_SIZE= Target.the("Select size").locatedBy("//option[contains(text(),'M')]");
    public static final Target BUTTON_ADD_TO_CART= Target.the("Select button add to cart").locatedBy("//button[@class='exclusive']");
    public static final Target TEXT_ADD_SUCCESSFULLY= Target.the("capture product text add successfully").locatedBy("//div[@class='layer_cart_product col-xs-12 col-md-6']/h2");
}
