import org.junit.jupiter.api.Test;


import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;
class PostmanEchoTest {

    @Test
    void TestingAnswerPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Beautiful weather") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Beautiful weather"))
        ;
    }
}
