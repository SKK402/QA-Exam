package com.test.LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.test.Login.Login;
import com.test.Products.Products;
import com.test.Base.Base;
import com.test.Cart.Cart;
import com.test.Checkout.Checkout;

import java.time.Duration;

public class LoginTest extends Base {
    WebDriver driver;
    Login login;
    Products products;
    Cart cart;
    Checkout checkout;

    @BeforeMethod
    public void setUp() {

        login = new Login(driver);
        products = new Products(driver);
        cart = new Cart(driver);
        checkout = new Checkout(driver);
    }

    @Test
    public void ValidLogin() {
        login.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }

    @Test
    public void EndCheckout() {
        login.login("standard_user", "secret_sauce");
        products.addFirstItemToCart();
        products.goToCart();
        cart.clickCheckout();
        checkout.fillCheckoutInfo();
        checkout.clickFinish();
        Assert.assertTrue(checkout.MessageDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
