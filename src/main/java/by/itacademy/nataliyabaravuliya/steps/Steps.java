package by.itacademy.nataliyabaravuliya.steps;

import by.itacademy.nataliyabaravuliya.driver.Driver;
import by.itacademy.nataliyabaravuliya.util.Util;
import by.itacademy.nataliyabaravuliya.pages.YvesRocherPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import by.itacademy.nataliyabaravuliya.pages.LoginPage;
import by.itacademy.nataliyabaravuliya.pages.ShoppingPage;

public class Steps {
    public WebDriver driver;

    public Steps(WebDriver driver) {


        this.driver = driver;
    }

    public void loginWithCorrectData() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_EMAIL)).sendKeys(LoginPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys(LoginPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
    }

    public void loginFormWithEmptyPassword() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_EMAIL)).sendKeys(LoginPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
    }

    public void loginFormWithEmptyLogin() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys(LoginPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
    }

    public void formWithEmptyCredentials() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
    }

    public void addProductSearchString() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_EMAIL)).sendKeys(LoginPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys(LoginPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_SEARCH)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_SEARCH)).sendKeys(ShoppingPage.HAND_CREAM);
        //driver.findElement(By.xpath(YvesRocherPage.INPUT_SEARCH)).sendKeys(YvesRocherPage.HAND_CREAM);
        Util.waitForElementLocatedBy(driver, By.xpath(YvesRocherPage.BTN_SEARCH)).click();
        driver.findElement(By.xpath(YvesRocherPage.ADD_HAND_CREAM)).click();
        driver.findElement(By.xpath(YvesRocherPage.HAND_CREAM_MY_CART)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_CART)).click();
    }

    public void addAProductFromTheCatalog() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_EMAIL)).sendKeys(LoginPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys(LoginPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        Util.waitForElementLocatedBy(driver, By.xpath(YvesRocherPage.BTN_GIFT_IDEAS)).click();
        Util.waitForElementLocatedBy(driver, By.xpath(YvesRocherPage.ADD_PRODUCT_MY_CART)).click();
        driver.findElement(By.xpath(YvesRocherPage.PRODUCT_MY_CART)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_CART)).click();
    }
}
