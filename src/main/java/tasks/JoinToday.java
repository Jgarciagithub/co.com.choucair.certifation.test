package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.TestJointoday;

public class JoinToday implements Task {

    public static JoinToday clicbuttonjointoday() {
        return Tasks.instrumented(JoinToday.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TestJointoday.JOINTODAY_BUTTON));

    }
}
