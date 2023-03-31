package by.itacademy.nataliyabaravuliya.ui;

import java.time.Duration;

import by.itacademy.nataliyabaravuliya.driver.steps.Steps;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import by.itacademy.nataliyabaravuliya.driver.pages.LoginPage;
import by.itacademy.nataliyabaravuliya.driver.pages.YvesRocherPage;


public class YvesRocherTest {
    WebDriver driver;
    Steps steps;

    @BeforeEach
    public void warmUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(YvesRocherPage.URL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        steps = new Steps(driver);
    }

    @Test
    public void tesLoginWithCorrectData() {
        steps.loginWithCorrectData();
        WebElement personal = driver.findElement(By.xpath(LoginPage.INPUT_USER_NAME_AUTORIZATION));
        Assertions.assertTrue(personal.isDisplayed());
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
    public void testAddAProductFromTheCatalog() {
        steps.addAProductFromTheCatalog();
        Assertions.assertEquals("Код продукта 71463",
                driver.findElement(By.xpath(YvesRocherPage.CODE_OF_PRODUCT)).getText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
