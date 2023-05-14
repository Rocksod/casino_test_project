package ru.testing.api.services;

import com.google.gson.Gson;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import ru.testing.api.entities.PlayerRequest;
import ru.testing.api.entities.PlayerResponse;
import ru.testing.api.entities.User;

import static io.restassured.RestAssured.given;

public class PlayerService extends Service {

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
                .statusCode(201)
                .body(Matchers.notNullValue())
                .extract().response();

        logger.info("Request to /api/users: {}", json);
        logger.info("Response from /api/users: {}", response.asString());

        return response.body().as(PlayerResponse.class);
    }

}
