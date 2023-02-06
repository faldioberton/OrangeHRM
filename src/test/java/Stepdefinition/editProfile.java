package Stepdefinition;

import config.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.Random;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class editProfile extends environment{
    pageProfile pageProfile = new pageProfile();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Random rand = new Random();



    @Then("user verify (.*) login as User result$")
    public void user_verify_success_login_as_user_result(String status) {
        if (status.contains("success")){
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("path0"))
            );
        } else {
            driver.findElement(pageProfile.getNotif_eror());
        }
    }
//    @When("user click Punch-In")
//    public void user_click_punch_in() {
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(pageProfile.getBtn_punchIn())
//        );
//        driver.findElement(pageProfile.getBtn_punchIn()).click();
//    }
    @Then("user click button In")
    public void user_click_button_in() throws InterruptedException{
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageProfile.getBtn_In())
        );
        driver.findElement (pageProfile.getBtn_In()).click();

    }
//    @And("user successfully Punch In")
//    public void user_successfully_punch_in() throws InterruptedException{
//        Thread.sleep(20000);
//        driver.findElement(pageProfile.getBtn_out()).isDisplayed();
//    }
    @When("user click My Info")
    public void user_click_my_info() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageProfile.getBtn_MyInfo())
        );
       driver.findElement(pageProfile.getBtn_MyInfo()).click();
    }
    @Then("user click Nationality")
    public void user_click_nationality() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageProfile.getBtn_Nationality())
        );
        driver.findElement(pageProfile.getBtn_Nationality()).click();
    }
    @Then("user choose Indonesian")
    public void user_choose_indonesian() {
        WebElement element = driver.findElement (By.xpath ("//*[contains(text(),'Indonesian')]"));
        //js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }
    @Then("user click Marital Status")
    public void user_click_marital_status() {
        driver.findElement(pageProfile.getBtn_MaritalStatus()).click();
    }
    @Then("user choose single")
    public void user_choose_single() {
        WebElement element = driver.findElement (By.xpath ("//*[contains(text(),'Married')]"));
        //js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();

    }
    @Then("user choose male for gender")
    public void user_choose_male_for_gender() {
        driver.findElement(pageProfile.getBtn_gender()).click();
    }
    @Then("user click Save")
    public void user_click_save() {
        driver.findElement(pageProfile.getBtn_Save()).click();
    }
    @Then("user click Attendance")
    public void user_click_Attendance() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageProfile.getBtn_attendance())
        );
        driver.findElement(pageProfile.getBtn_attendance()).click();
    }
    @And("user click menu punch")
    public void user_click_menu_punch() {
        driver.findElement(pageProfile.getBtn_punch()).click();

    }
    @When("user click Time")
    public void user_click_time() {
        driver.findElement(pageProfile.getBtn_time()).click();
    }
    @Then("user click button Out")
    public void user_click_button_out() throws InterruptedException {
        Thread.sleep(20000);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageProfile.getBtn_out())
        );
        driver.findElement(pageProfile.getBtn_out()).click();
        Thread.sleep(20000);
    }
}
