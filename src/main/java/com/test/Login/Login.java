package com.test.Login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import com.test.Base.Base;
import com.test.ReportUtils.ExtentReport;
import org.openqa.selenium.By;


public class Login extends Base {
    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void Username(String standard_user) {
        driver.findElement(username).sendKeys("standard_user");
    }

    public void Password(String secret_sauce) {
        driver.findElement(password).sendKeys("secret_sauce");
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void login(String standard_user, String secret_sauce) {
        Username(standard_user);
        Password(secret_sauce);
        clickLogin();
    }
}
