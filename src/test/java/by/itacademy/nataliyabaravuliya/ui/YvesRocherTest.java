package by.itacademy.nataliyabaravuliya.ui;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import by.itacademy.nataliyabaravuliya.pages.YvesRocherPage;


public class YvesRocherTest extends BaseTest {
    @Test
    @DisplayName("Выбор товара в строке поиск")
    public void testAddProductSearchString() {
        steps.addProductSearchString();
        Assertions.assertTrue(driver.findElement(By.xpath(YvesRocherPage.IMAGE_OF_PRODUCT)).isDisplayed());
    }

    @Test
    @DisplayName("Выбор товара по котологу")
    public void testAddProductFromTheCatalog() {
        steps.addAProductFromTheCatalog();
        Assertions.assertEquals("Код продукта 71463",
                driver.findElement(By.xpath(YvesRocherPage.CODE_OF_PRODUCT)).getText());
    }
}
