package tests;

import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;


public class APITests extends Specifications {


    @Test
    @DisplayName("Check successful user registration")
    public void successfulUserRegistrationTest() {
        Specifications.installSpecification(Specifications.requestSpecBaseSettings(), Specifications.responseSpecStatus200());
        Map<String, String> user = new HashMap<>();
        user.put("email", "");
        user.put("password", "");
        Response response =
                given()
                        .body(user)
                        .post("/tasks/rest/createuser")
                        .then()
                        .extract().response();
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.get("id");
        String token = jsonPath.get("token");
        Assertions.assertEquals(5, id);
        Assertions.assertEquals("" +
                "", token);
    }


}







