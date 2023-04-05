package by.itacademy.nataliyabaravuliya.ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import by.itacademy.nataliyabaravuliya.pages.LoginPage;
import by.itacademy.nataliyabaravuliya.pages.YvesRocherPage;


public class YvesRocherTest extends BaseTest {

    @Test
    public void tesLoginWithCorrectData() {
        steps.loginWithCorrectData();
        Assertions.assertTrue(driver.findElement(By.xpath(LoginPage.INPUT_USER_NAME_AUTORIZATION)).isDisplayed());
    }

    @Test
    public void testLoginFormWithEmptyPassword() {
        steps.loginFormWithEmptyPassword();
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_PASSWORD)).getText());
    }

    @Test
    public void testLoginFormWithEmptyLogin() {
        steps.loginFormWithEmptyLogin();
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_EMAIL)).getText());
    }

    @Test
    public void testFormWithEmptyCredentials() {
        steps.formWithEmptyCredentials();
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_PASSWORD)).getText());
        Assertions.assertEquals("Это поле является обязательным",
                driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_EMAIL)).getText());
    }

    @Test
    public void testAddProductSearchString() {
        steps.addProductSearchString();
        Assertions.assertTrue(driver.findElement(By.xpath(YvesRocherPage.IMAGE_OF_PRODUCT)).isDisplayed());
    }

    @Test
    public void testAddProductFromTheCatalog() {
        steps.addAProductFromTheCatalog();
        Assertions.assertEquals("Код продукта 0007",
                driver.findElement(By.xpath(YvesRocherPage.CODE_OF_PRODUCT)).getText());
    }
}
