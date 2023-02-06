package objekrepository;

import org.openqa.selenium.By;

public class pageAdd {

    By btn_username = By.name("username");
    By btn_password = By.name("password");
    By notif_eror = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]");
    By btn_PIM = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
    By btn_add = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By field_firstname = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
    By field_lastname = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input");
    By btn_switch = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
    By field_username = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
    By field_password = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
    By field_password2 = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
    By btn_save = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
    By notice_success = By.xpath("//*[@id='oxd-toaster_1']");

    public By getBtn_PIM() {
        return btn_PIM;
    }

    public By getBtn_add() {
        return btn_add;
    }

    public By getField_firstname() {
        return field_firstname;
    }

    public By getField_lastname() {
        return field_lastname;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getField_username() {
        return field_username;
    }

    public By getField_password() {
        return field_password;
    }

    public By getField_password2() {
        return field_password2;
    }

    public By getBtn_save() {
        return btn_save;
    }

    public By getNotice_success() {
        return notice_success;
    }

    public By getBtn_password() {
        return btn_password;
    }

    public By getBtn_username() {
        return btn_username;
    }

    public By getNotif_eror() {
        return notif_eror;
    }
}
