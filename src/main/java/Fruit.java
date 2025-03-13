public class Fruit {
    public int id;
    public String name;
    public int price;
    public String origin;

    public Fruit() {
    }

    public Fruit(int id, String name, int price, String origin) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return String.format("| %-10d | %-15s | %-10s | %-8.2f$ |\n", id, name, origin, price);
    }

    public String shopList() {
        return String.format("%-10d %-15s %-10s %-8.2f", id, name, origin, price);
    }

}
