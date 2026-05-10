package services;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import models.Order;

import static io.restassured.RestAssured.given;

public class StoreService extends BaseService {

    @Step("Create order with id {order.id}")
    public Response createOrder(Order order) {
        return request()
                .body(order)
                .post("/store/order");
    }
    @Step("Get order by id {id}")
    public Response getOrder(int id) {
        return request()
                .get("/store/order/" + id);
    }
    @Step("Delete order by id: {id}")
    public Response deleteOrder(int id) {
        return request()
                .delete("/store/order/" + id);
    }
    @Step("Get order by id: {id}")
    public Response getInventory() {
        return request()
                .get("/store/inventory");
    }
}