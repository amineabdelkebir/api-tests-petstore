package utils.builders;

import models.Order;

public class OrderBuilder {

    public static Order defaultOrder() {
        return new Order(1, 101, 2, "placed");
    }
}
