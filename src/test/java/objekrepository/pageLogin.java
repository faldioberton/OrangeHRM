package objekrepository;

import org.openqa.selenium.By;

public class pageLogin {

    By field_username = By.name("username");
    By field_password = By.name("password");
    By btn_login = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    By notif_eror = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");

    public By getField_username() {
        return field_username;
    }

    public By getField_password() {
        return field_password;
    }

    public By getBtn_login() {
        return btn_login;
    }

    public By getNotif_eror() {
        return notif_eror;
    }
}
