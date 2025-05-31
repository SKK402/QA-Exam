package com.test.Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.Base.Base;

public class Checkout extends Base {
    WebDriver driver;

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By Message = By.className("complete-header");

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCheckoutInfo() {
        driver.findElement(firstName).sendKeys("Som");
        driver.findElement(lastName).sendKeys("Kunar");
        driver.findElement(postalCode).sendKeys("560100");
        driver.findElement(continueBtn).click();
    }

    public void clickFinish() {
        driver.findElement(finishBtn).click();
    }

    public boolean MessageDisplayed() {
        return driver.findElement(Message).isDisplayed();
    }
}
