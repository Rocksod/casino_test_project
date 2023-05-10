package ru.testing.api.services;

import com.google.gson.Gson;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import ru.testing.api.entities.PlayerRequest;
import ru.testing.api.entities.PlayerResponse;
import ru.testing.api.entities.User;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerService extends ru.testing.api.services.Service {

    private static final String ENDPOINT_PLAYER_URL = "/api/users";

    public PlayerResponse signUpPlayer(User user) {
        PlayerRequest playerRequest = new PlayerRequest();
        playerRequest.setUser(user);
        String json = new Gson().toJson(playerRequest);

        Response response = given()
                .header("Accept", "application/vnd.softswiss.v1+json;charset=UTF-8")
                .header("Connection", "keep-alive")
                .spec(requestSpec)
                .body(json)
                .post(ENDPOINT_PLAYER_URL)
                .then()
                .assertThat()
                .statusCode(Matchers.anyOf(Matchers.is(200), Matchers.is(201)))
                .body(Matchers.notNullValue())
                .extract().response();

        return response.body().as(PlayerResponse.class);
    }

}
