import java.io.PrintStream;

public class Order extends Fruit{
    public int quantity;
    public int amount;

    public Order(){

    }
    public Order(int id, String name ,int quantity, int price, int amount ){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }
    public PrintStream showOrder(){
        return System.out.format("%-10d.%-15s | %-10d | %-10d$ | %-10d$", id, name, quantity, price, amount);
    }
}
