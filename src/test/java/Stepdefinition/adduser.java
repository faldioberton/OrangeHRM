package Stepdefinition;

import config.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageAdd;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class adduser extends environment {

    pageAdd pageAdd = new pageAdd();
    @When("user Input (.*) as username$")
    public void user_Input_username(String username) {
        WebElement field_userName = driver.findElement(pageAdd.getBtn_username());
        field_userName.isDisplayed();
        field_userName.sendKeys(username);
    }

    @And("user Input (.*) as password$")
    public void user_input_password(String password) {
        WebElement field_password = driver.findElement(pageAdd.getBtn_password());
        Assert.assertTrue(field_password.isEnabled());
        field_password.sendKeys(password);
    }
    @Then("user Verify (.*) login result$")
    public void user_Verify_success_login_result(String status) {
        if (status.contains("success")){
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("path0"))
            );
        } else {
            driver.findElement(pageAdd.getNotif_eror());
        }
    }

    @When("user click menu PIM to add user")
    public void user_click_menu_pim_to_add_user() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageAdd.getBtn_PIM())
        );
        driver.findElement(pageAdd.getBtn_PIM()).click();
    }

    @When("user click button add")
    public void user_click_button_add() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageAdd.getBtn_add())
        );
        driver.findElement(pageAdd.getBtn_add()).click();
    }

    @Then("user input First Name")
    public void user_input_first_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageAdd.getField_firstname())
        );
        driver.findElement(pageAdd.getField_firstname()).click();
        String input = "Merk";
        driver.findElement(pageAdd.getField_firstname()).sendKeys(input);
    }

    @And("user input Last Name")
    public void user_input_last_name() {
        driver.findElement(pageAdd.getField_lastname()).click();
        String input = "Laptop";
        driver.findElement(pageAdd.getField_lastname()).sendKeys(input);
    }

    @Then("user click button switch create login details")
    public void user_click_button_switch_create_login_details() {
        driver.findElement(pageAdd.getBtn_switch()).click();
    }

    @And("user input (.*) as user$")
    public void user_Input_user(String user) {
        WebElement field_userName = driver.findElement(pageAdd.getField_username());
        field_userName.isDisplayed();
        field_userName.sendKeys(user);
    }

    @And("user input (.*) as pass$")
    public void user_Input_password(String pass) {
        WebElement field_password = driver.findElement(pageAdd.getField_password());
        field_password.isDisplayed();
        field_password.sendKeys(pass);
    }
    @And("user input (.*) as pass2$")
    public void user_input_password2(String pass) {
        WebElement field_password2 = driver.findElement(pageAdd.getField_password2());
        field_password2.isDisplayed();
        field_password2.sendKeys(pass);
    }

    @And("user click save")
    public void user_click_save() {
        driver.findElement(pageAdd.getBtn_save()).click();
    }

    @Then("user success add user")
    public void user_success_add_user() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageAdd.getNotice_success())
        );
    }
}
