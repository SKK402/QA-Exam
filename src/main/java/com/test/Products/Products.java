package com.test.Products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.Base.Base;

public class Products extends Base {
    WebDriver driver;

    WebElement firstItemAddToCart =  driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    WebElement cartIcon =  driver.findElement(By.id("shopping_cart_container"));

    public Products(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstItemToCart() {
        firstItemAddToCart.click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
