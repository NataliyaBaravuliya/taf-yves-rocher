package by.itacademy.nataliyabaravuliya.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class YvesRocherAPITest {
    @Test
    public void test() { //запрос к сайту
        String URL = "https://www.y-r.by/";
        when().get(URL)
                .then().assertThat().statusCode(200);
    }

    @Test
    public void test2() { //авторизация пользователя

    }
}
