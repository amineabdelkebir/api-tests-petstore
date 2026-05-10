package services;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import utils.ConfigManager;

public class BaseService {

    protected RequestSpecification request() {
        return given()
                .baseUri(ConfigManager.get("base.url"))
                .header("Content-Type", "application/json");
    }
}