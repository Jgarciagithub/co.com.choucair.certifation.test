package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.core.IsNull;
import userinterface.EnterDataPage;

public class Answer implements Question<Boolean> {

    private String name, lastname, Emailaddress, Month, Day, Year, CreatedPassword;

    public Answer( String name, String lastname, String emailaddress, String month, String day, String year, String createdPassword) {
        this.name = name;
        this.lastname = lastname;
        Emailaddress = emailaddress;
        Month = month;
        Day = day;
        Year = year;
        CreatedPassword = createdPassword;

    }

    public static Answer tothe( String name, String lastname, String emailaddress, String month, String day, String year, String createdPassword)
    {
        return new Answer( name, lastname, emailaddress, month, day, year, createdPassword);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Result;
        String name= Text.of(EnterDataPage.INPUT_FIRTSNAME).viewedBy(actor).asString();
        String lastname= Text.of(EnterDataPage.INPUT_LASTNAME).viewedBy(actor).asString();
        String emailaddress= Text.of(EnterDataPage.INPUT_EMAILADDRESS).viewedBy(actor).asString();
        String month = Text.of(EnterDataPage.INPUT_DATEOFBIRTH).viewedBy(actor).asString();
        String day =Text.of(EnterDataPage.INPUT_DAYOFBIRTH).viewedBy(actor).asString();
        String year = Text.of(EnterDataPage.INPUT_YEAROFBIRTH).viewedBy(actor).asString();
        String createdPassword =Text.of(EnterDataPage.INPUT_CREATEPASSWORD).viewedBy(actor).asString();
        if (name.equals(name) && lastname.equals(lastname) && emailaddress.equals(emailaddress) && month.equals(month) && day.equals(day) && year.equals(year) && createdPassword.equals(createdPassword) )
        {
            Result=true;
        }
        else
        {
            Result=false;
        }
        return Result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
