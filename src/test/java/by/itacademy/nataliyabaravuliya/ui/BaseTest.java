package by.itacademy.nataliyabaravuliya.ui;

import by.itacademy.nataliyabaravuliya.driver.Driver;
import by.itacademy.nataliyabaravuliya.pages.YvesRocherPage;
import by.itacademy.nataliyabaravuliya.steps.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver = Driver.getDriver();
    Steps steps;

    @BeforeEach
    public void warmUp() {

        driver.get(YvesRocherPage.URL);
        steps = new Steps(driver);
    }

    @AfterEach
    public void tearDown() {

        Driver.close();
    }
}
