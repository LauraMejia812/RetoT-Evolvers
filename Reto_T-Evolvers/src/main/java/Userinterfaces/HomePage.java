package Userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target MY_STORE_ICON= Target.the("Capture home page icon").locatedBy("//img[@class='logo img-responsive']");
    public static final Target DRESSES_BUTTON= Target.the("Select dresses button").locatedBy("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
    public static final Target SEARCH_FIELD= Target.the("Enter text in the search field").located(By.id("search_query_top"));
    public static final Target BUTTON_SEARCH= Target.the("Click in button search").locatedBy("//button[@class='btn btn-default button-search']");

}
