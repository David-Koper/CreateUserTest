package tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;


public class APITests extends TestData {


    @Test
    @DisplayName("Check successful user registration")
    public void successfulUserRegistrationTest() {
        Specifications.installSpecification(Specifications.requestSpecBaseSettings(), Specifications.responseSpecStatus200());
        Map<String, String> user = new HashMap<>();
        user.put("email", email);
        user.put("name", name);
        user.put("tasks", tasks);
        user.put("companies", companies);
        user.put("hobby", hobby);
        user.put("adres", adres);
        user.put("name1", name1);
        user.put("surname1", surname1);
        user.put("fathername1", fathername1);
        user.put("cat", cat);
        user.put("dog", dog);
        user.put("parrot", parrot);
        user.put("cavy", cavy);
        user.put("hamster", hamster);
        user.put("squirrel", squirrel);
        user.put("phone", phone);
        user.put("inn", inn);
        user.put("gender", gender);
        user.put("birthday", birthday);
        user.put("date_start", date_start);

        Response response =
                given()
                        .body(user)
                        .post("/tasks/rest/createuser")
                        .then()
                        .extract().response();
        JsonPath jsonPath = response.jsonPath();
        String responseName = jsonPath.get("name");
        String responseEmail = jsonPath.get("email");
        String responseHobby = jsonPath.get("hobby");
        String responsePhone = jsonPath.get("phone");
        String responseInn = jsonPath.get("inn");
        Assertions.assertEquals(name, responseName);
        Assertions.assertEquals(email, responseEmail);
        Assertions.assertEquals(hobby, responseHobby);
        Assertions.assertEquals(phone, responsePhone);
        Assertions.assertEquals(inn, responseInn);
    }


}







