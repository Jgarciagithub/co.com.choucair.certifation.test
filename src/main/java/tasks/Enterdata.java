package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.EnterDataPage;

public class Enterdata implements Task {

    private String name, lastname, Emailaddress, Month, Day, Year, CreatedPassword;

    public Enterdata(String name, String lastname, String emailaddress, String month, String day, String year, String createdPassword) {
        this.name = name;
        this.lastname = lastname;
        Emailaddress = emailaddress;
        Month = month;
        Day = day;
        Year = year;
        CreatedPassword = createdPassword;
        }

    public static Enterdata the(String name, String lastname, String emailadress ,String month,String day,String year,String createdPassword){
        return Tasks.instrumented(Enterdata.class,name,lastname,emailadress, month,day,year,createdPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(name).into(EnterDataPage.INPUT_FIRTSNAME)
                , Enter.theValue(lastname).into(EnterDataPage.INPUT_LASTNAME)
                , Enter.theValue(Emailaddress).into(EnterDataPage.INPUT_EMAILADDRESS)
                , Enter.theValue(Month).into(EnterDataPage.INPUT_DATEOFBIRTH)
                , Enter.theValue(Day).into(EnterDataPage.INPUT_DAYOFBIRTH)
                , Enter.theValue(Year).into(EnterDataPage.INPUT_YEAROFBIRTH)
                , Click.on(EnterDataPage.NEXTLOCATION_BUTTON)
                , Click.on(EnterDataPage.NEXTLOCATIONADRESS_BUTTON)
                , Click.on(EnterDataPage.NEXTLOCATIONDIVACES_BUTTON)
                , Enter.theValue(CreatedPassword).into(EnterDataPage.INPUT_CREATEPASSWORD)
                , Enter.theValue(CreatedPassword).into(EnterDataPage.INPUT_CONFRIMPASSWORD)
                , Click.on(EnterDataPage.CHECK_PRIVACYANDTERMIN)
                , Click.on(EnterDataPage.CHECK_USETERM));
    }
}
