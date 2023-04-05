package by.itacademy.nataliyabaravuliya.api;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class YvesRocherAPITest {
    JSONObject user = new JSONObject();

    @Test
    public void testGetRequest() {
        when().get(TestDate.URL)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void test() {
        user.put("email", TestDate.VALID_EMAIL);
        user.put("password", TestDate.VALID_PASSWORD);
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(user.toJSONString())
                .when()
                .post(TestDate.LOGIN_URL)
                .then().log().body()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void test1() {
        user.put("email", TestDate.INCORRECT_EMAIL);
        user.put("password", TestDate.VALID_PASSWORD);
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(user.toJSONString())
                .when()
                .post(TestDate.LOGIN_INCORRECT_URL)
                .then().log().body()
                .assertThat()
                .statusCode(401);
    }
}
