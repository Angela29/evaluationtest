package starter.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.login.LoginForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRegister implements Task {

    private final String email_field;
    private final String user_gender;
    private final String user_first_name;
    private final String user_last_name;
    private final String user_pass;
    private final String user_birth_day;
    private final String user_birth_month;
    private final String user_birth_year;
    private final String user_company;
    private final String user_address_one;
    private final String user_address_two;
    private final String user_city;
    private final String user_state;
    private final String user_post_code;
    private final String user_country;
    private final String user_aditional_information;
    private final String user_phone;
    private final String user_phone_mobile;
    private final String user_alias;

    public DoRegister(String email_field, String user_gender, String user_first_name, String user_last_name, String user_pass, String user_birth_day, String user_birth_month, String user_birth_year, String user_company, String user_address_one, String user_address_two, String user_city, String user_state, String user_post_code, String user_country, String user_aditional_information, String user_phone, String user_phone_mobile, String user_alias) {
        this.email_field = email_field;
        this.user_gender = user_gender;
        this.user_first_name = user_first_name;
        this.user_last_name = user_last_name;
        this.user_pass = user_pass;
        this.user_birth_day = user_birth_day;
        this.user_birth_month = user_birth_month;
        this.user_birth_year = user_birth_year;
        this.user_company = user_company;
        this.user_address_one = user_address_one;
        this.user_address_two = user_address_two;
        this.user_city = user_city;
        this.user_state = user_state;
        this.user_post_code = user_post_code;
        this.user_country = user_country;
        this.user_aditional_information = user_aditional_information;
        this.user_phone = user_phone;
        this.user_phone_mobile = user_phone_mobile;
        this.user_alias = user_alias;
    }

    public static Performable withcredencials(String user_email,
                                              String user_gender,
                                              String user_first_name,
                                              String user_last_name,
                                              String user_pass,
                                              String user_company,
                                              String user_address_one,
                                              String user_address_two,
                                              String user_city,
                                              String user_state,
                                              String user_post_code,
                                              String user_country,
                                              String user_phone_mobile,
                                              String user_alias
                                              )
    {
        return instrumented(DoRegister.class, user_email, user_gender,user_first_name, user_last_name, user_pass,user_company, user_address_one, user_address_two, user_city,user_state,user_post_code, user_country, user_phone_mobile,user_alias);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterForm.LINK_TEXT),
                Enter.theValue(email_field).into(RegisterForm.EMAIL_FIELD),
                Click.on(RegisterForm.BUTTON_CREATE),
                Click.on(RegisterForm.GENDER),
                Enter.theValue(user_first_name).into(RegisterForm.FIRST_NAME),
                Enter.theValue(user_last_name).into(RegisterForm.LAST_NAME),
                Enter.theValue(user_pass).into(RegisterForm.PASSWORD_FIELD),
                Enter.theValue(user_company).into(RegisterForm.COMPANY),
                Enter.theValue(user_address_one).into(RegisterForm.ADDRESS_ONE),
                Enter.theValue(user_address_two).into(RegisterForm.ADDRESS_TWO),
                Enter.theValue(user_city).into(RegisterForm.CITY),
                Enter.theValue(user_state).into(RegisterForm.STATE),
                Enter.theValue(user_post_code).into(RegisterForm.POST_CODE),
                Enter.theValue(user_country).into(RegisterForm.COUNTRY),
                Enter.theValue(user_phone_mobile).into(RegisterForm.PHONE_MOBILE),
                Enter.theValue(user_alias).into(RegisterForm.ALIAS),
                Click.on(RegisterForm.BUTTON_REGISTER)
        );
    }
}
