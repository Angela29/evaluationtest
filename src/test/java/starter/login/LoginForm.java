package starter.login;

import org.openqa.selenium.By;

public class LoginForm {
    public static By LINK_TEXT= By.linkText("Sign in");
    public static By EMAIL_FIELD= By.id("email");
    public static By PASSWORD_FIELD= By.id("passwd");
    public static By SIGNIN_BUTTON= By.xpath("//button[@id='SubmitLogin']/span");

}
