package com.test.Cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    WebDriver driver;

    By checkoutButton = By.id("checkout");

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}
