package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtesPage;

public class OpenUp implements Task{
    private UtesPage utesPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utesPage));

    }
}
