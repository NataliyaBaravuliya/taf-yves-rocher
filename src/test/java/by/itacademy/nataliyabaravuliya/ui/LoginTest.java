package by.itacademy.nataliyabaravuliya.ui;

import by.itacademy.nataliyabaravuliya.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Авторизация с корректными данными")
    public void testLoginFormWithCorrectData() {
        steps.loginFormWithCorrectData();
        Assertions.assertTrue(driver.findElement(By.xpath(LoginPage.INPUT_USER_NAME_AUTORIZATION))
                .isDisplayed());
    }

    @Test
    @DisplayName("Авторизация с пустым паролем")
    public void testLoginFormWithEmptyPassword() {
        steps.loginFormWithEmptyPassword();
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(LoginPage.INPUT_NO_PASSWORD)).getText());
    }

    @Test
    @DisplayName("Авторизация с пустым email")
    public void testLoginFormWithEmptyLogin() {
        steps.loginFormWithEmptyLogin();
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(LoginPage.INPUT_NO_EMAIL)).getText());
    }

    @Test
    @DisplayName("Авторизация с пустым паролем и email")
    public void testFormWithEmptyCredentials() {
        steps.formWithEmptyCredentials();
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(LoginPage.INPUT_NO_PASSWORD)).getText());
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(LoginPage.INPUT_NO_EMAIL)).getText());
    }
}
