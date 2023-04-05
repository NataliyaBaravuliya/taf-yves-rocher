package by.itacademy.nataliyabaravuliya.ui;

import by.itacademy.nataliyabaravuliya.driver.Driver;
import by.itacademy.nataliyabaravuliya.pages.YvesRocherPage;
import by.itacademy.nataliyabaravuliya.steps.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
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

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
