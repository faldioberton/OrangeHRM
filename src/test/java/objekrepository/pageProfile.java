package objekrepository;

import org.openqa.selenium.By;

public class pageProfile {
    By notif_eror = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div");
    By btn_punchIn = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/button");
    By btn_In = By.xpath("//button[contains(@type, 'submit')]");
            //By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/button");
            //By.cssSelector(".oxd-button");
            //By.xpath("//button[contains(@type, 'submit')]");
    By btn_attendance = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span");
    By btn_punch = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a");
    By btn_MyInfo = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a");
    By btn_Nationality = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]");
    By btn_Indonesian = //By.id("83");
            By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]");
    By btn_MaritalStatus = By.xpath("//*[@class='orangehrm-edit-employee-content']//div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[2]//div[@class='oxd-select-text-input']");
    By btn_single = By.linkText("Single");
    By btn_gender = By.xpath("//label[.='Male']");
    By btn_Save = By.xpath("//div[@class='orangehrm-edit-employee-content']/div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By btn_time = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
    By btn_out = By.xpath("//button[contains(@type, 'submit')]");
    //By.cssSelector(".oxd-button");
    public By getNotif_eror() {
        return notif_eror;
    }

    public By getBtn_punchIn() {
        return btn_punchIn;
    }

    public By getBtn_In() {
        return btn_In;
    }

    public By getBtn_attendance() {
        return btn_attendance;
    }

    public By getBtn_punch() {
        return btn_punch;
    }

    public By getBtn_MyInfo() {
        return btn_MyInfo;
    }

    public By getBtn_Nationality() {
        return btn_Nationality;
    }

    public By getBtn_MaritalStatus() {
        return btn_MaritalStatus;
    }

    public By getBtn_single() {
        return btn_single;
    }

    public By getBtn_Indonesian() {
        return btn_Indonesian;
    }

    public By getBtn_gender() {
        return btn_gender;
    }

    public By getBtn_Save() {
        return btn_Save;
    }

    public By getBtn_time() {
        return btn_time;
    }

    public By getBtn_out() {
        return btn_out;
    }
}
