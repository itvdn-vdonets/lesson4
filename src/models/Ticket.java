package models;

public class Ticket {
    private int id;
    private String direction;
    private int price;

    public Ticket(int id, String direction, int price) {
        this.id = id;
        this.direction = direction;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ", price=" + price +
                '}';
    }
}
