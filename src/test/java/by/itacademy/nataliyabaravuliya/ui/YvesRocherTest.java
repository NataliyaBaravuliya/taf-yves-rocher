package by.itacademy.nataliyabaravuliya.ui;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YvesRocherTest {
    WebDriver driver;

    @Before
    public void warmUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(YvesRocherPage.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testYvesRocherLoginWithCorrectData() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_EMAIL)).sendKeys(UserPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.INPUT_PASSWORD)).sendKeys(UserPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        WebElement personal = driver.findElement(By.xpath(UserPage.INPUT_USER_NAME_AUTORIZATION));
        Assert.assertTrue(personal.isDisplayed());
    }

    @Test
    public void testYvesRocherLoginFormWithEmptyPassword() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_EMAIL)).sendKeys(UserPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        Assert.assertEquals("Это поле является обязательным", driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_PASSWORD)).getText());
    }

    @Test
    public void testYvesRocherLoginFormWithEmptyLogin() { //путой e-mail
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_PASSWORD)).sendKeys(UserPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        Assert.assertEquals("Это поле является обязательным", driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_EMAIL)).getText());
    }

    @Test
    public void testYvesRocherLoginFormWithEmptyCredentials() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        Assert.assertEquals("Это поле является обязательным", driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_PASSWORD)).getText());
        Assert.assertEquals("Это поле является обязательным", driver.findElement(By.xpath(YvesRocherPage.INPUT_NO_EMAIL)).getText());
    }

    @Test
    public void Test5() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_EMAIL)).sendKeys(UserPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.INPUT_PASSWORD)).sendKeys(UserPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_SEARCH)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_SEARCH)).sendKeys(ShoppingPage.HAND_CREAM);
        driver.findElement(By.xpath(YvesRocherPage.BTN_SEARCH)).click();
        driver.findElement(By.xpath(YvesRocherPage.ADD_HAND_CREAM)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_CART)).click();
        Assert.assertEquals("Крем Для Рук «Бурбонская Ваниль»", driver.findElement(By.xpath(YvesRocherPage.HAND_CREAM_MY_CART)).getText());
        driver.quit();

    }
    @Test
    public void Test6() {
        driver.findElement(By.xpath(YvesRocherPage.BTN_RECLAME)).click();
        driver.findElement(By.xpath(YvesRocherPage.ICON_LOG_IN)).click();
        driver.findElement(By.xpath(YvesRocherPage.BTN_AUTHORIZATION)).click();
        driver.findElement(By.xpath(YvesRocherPage.INPUT_EMAIL)).sendKeys(UserPage.EMAIL_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.INPUT_PASSWORD)).sendKeys(UserPage.PASSWORD_ACTUAL);
        driver.findElement(By.xpath(YvesRocherPage.BTN_ENTER)).click();


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
