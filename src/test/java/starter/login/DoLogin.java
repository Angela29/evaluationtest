package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String user_email;
    private final String user_pass;

    public DoLogin(String user_email, String user_pass) {
        this.user_email = user_email;
        this.user_pass = user_pass;
    }

    public static Performable withcredencials(String user_email, String user_pass)
    {
        return instrumented(DoLogin.class, user_email, user_pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginForm.LINK_TEXT),
                Enter.theValue(user_email).into(LoginForm.EMAIL_FIELD),
                Enter.theValue(user_pass).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.SIGNIN_BUTTON)
        );
    }
}
