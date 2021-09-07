package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterDataPage extends PageObject {

    public static final Target INPUT_FIRTSNAME = Target.the("where do we write the firts name")
            .located(By.xpath("//*[@id=\'firstName\']"));

    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name")
            .located(By.xpath("//*[@id=\'lastName\']"));

    public static final Target INPUT_EMAILADDRESS = Target.the("where do we write the email address")
            .located(By.xpath("//*[@id=\'email\']"));

    public static final Target INPUT_DATEOFBIRTH = Target.the("where do we write the month of birth ")
            .located(By.xpath("//*[@id=\'birthMonth\']"));

    public static final Target INPUT_DAYOFBIRTH = Target.the("where do we write the day of birth ")
            .located(By.xpath("//*[@id=\'birthDay\']"));

    public static final Target INPUT_YEAROFBIRTH = Target.the("where do we write the year of birth ")
            .located(By.xpath("//*[@id=\'birthYear\']"));

    public static final Target NEXTLOCATION_BUTTON = Target.the("button that shows us the form to next register ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target NEXTLOCATIONADRESS_BUTTON = Target.the("button that shows us the form to next location address ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target NEXTLOCATIONDIVACES_BUTTON = Target.the("button that shows us the form to next divaces ")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a/i"));

    public static final Target INPUT_CREATEPASSWORD=Target.the("where do we write the password")
            .located(By.xpath("//*[@id='password']"));

    public static final Target INPUT_CONFRIMPASSWORD=Target.the("where do we write the confirm password")
            .located(By.xpath("//*[@id=\'confirmPassword\']"));

    public static final Target CHECK_USETERM=Target.the("where do we clic a check of use and termin")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACYANDTERMIN=Target.the("where do we clic a check of privacy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETTESETUP_BUTTON = Target.the("button that shows us the finish of register ")
            .located(By.xpath("//*[@id=\'laddaBtn\']"));
}
