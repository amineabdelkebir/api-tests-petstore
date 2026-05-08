package models;

public class Order {
    public int id;
    public int petId;
    public int quantity;
    public String status;

    public Order(int id, int petId, int quantity, String status) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.status = status;
    }
}