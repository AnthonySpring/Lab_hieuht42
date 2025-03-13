public class Order {
    private int id;
    private String name;
    private int quantity;
    private int price;
    private int amount;

    public Order(int id, String name, int quantity, int price, int amount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Hiển thị thông tin đơn hàng
    public void showOrder() {
        System.out.println("Product: " + name + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + amount);
    }
}
