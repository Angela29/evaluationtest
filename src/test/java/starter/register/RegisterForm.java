package starter.register;

import org.openqa.selenium.By;

public class RegisterForm {

        public static By LINK_TEXT= By.linkText("Sign in");
        public static By EMAIL_FIELD= By.id("email_create");
        public static By BUTTON_CREATE = By.xpath("//button[@id='SubmitCreate']/span");
        public static By GENDER = By.id("id_gender2");
        public static By FIRST_NAME = By.id("customer_firstname");
        public static By LAST_NAME = By.id("customer_lastname");
        public static By PASSWORD_FIELD= By.id("passwd");
        public static By COMPANY= By.id("company");
        public static By ADDRESS_ONE = By.id("address1");
        public static By ADDRESS_TWO = By.id("address2");
        public static By CITY = By.id("city");
        public static By STATE = By.id("id_state");
        public static By POST_CODE = By.id("postcode");
        public static By COUNTRY = By.id("id_country");
        public static By PHONE_MOBILE = By.id("phonemobile");
        public static By ALIAS = By.id("alias");
        public static By BUTTON_REGISTER = By.xpath("//button[@id='submitAccount']/span");
}
