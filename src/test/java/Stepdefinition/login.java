package Stepdefinition;

import config.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import objekrepository.pageLogin;


public class login extends environment{

    pageLogin pageLogin = new pageLogin();

    @Given("user is on Orangehrm Sign in page")
    public void user_is_on_orangehrm_sign_in_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getBtn_login())
        );
    }
    @When("user input (.*) as username$")
    public void user_input_username(String username) {
        WebElement field_userName = driver.findElement(pageLogin.getField_username());
        field_userName.isDisplayed();
        field_userName.sendKeys(username);
    }

    @And("user input (.*) as password$")
    public void user_input_password(String password) {
        WebElement field_password = driver.findElement(pageLogin.getField_password());
        Assert.assertTrue(field_password.isEnabled());
        field_password.sendKeys(password);
    }
    @And("user click enter")
    public void user_click_enter() {
        WebElement field_password = driver.findElement(pageLogin.getBtn_login());
        field_password.sendKeys(Keys.ENTER);
    }
    @Then("user verify (.*) login as Admin result$")
    public void user_verify_success_login_as_admin_result(String status) {
        if (status.contains("success")){
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.id("path0"))
            );
        } else {
            driver.findElement(pageLogin.getBtn_login());
        }
    }

    @Then("user failed login")
    public void user_verify_failed_login() {
        driver.findElement(pageLogin.getBtn_login()).isDisplayed();
    }
}
