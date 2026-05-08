package services;

import io.restassured.response.Response;
import models.Order;

import static io.restassured.RestAssured.given;

public class StoreService {

    private final String BASE_URL = "https://petstore.swagger.io/v2";

    public Response createOrder(Order order) {
        return given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .body(order)
                .when()
                .post("/store/order");
    }
}