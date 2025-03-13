import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    public static ArrayList<Fruit> fruits = new ArrayList<>();
    public static HashMap<String, ArrayList<Order>> orders = new HashMap<>();

    public static void AddFruit() {
        int id = Validate.GetID();
        String name = Validate.GetName();
        int price = Validate.GetPrice();
        String place = Validate.GetPlace();
        Fruit p = new Fruit(id, name, price, place);
        fruits.add(p);
        FruitDisplay();
    }

    public static void FruitDisplay() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.toString());
        }
    }

    public static void FruitShop() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.shopList());
        }
    }

    public static Fruit find(int id) {
        for (Fruit fruit : fruits) {
            if (fruit.getId() == id) {
                return fruit;
            }
        }
        return null;  // Trả về null nếu không tìm thấy
    }

    public static void addOrder(ArrayList<Order> cusOrder, int id, int quan) {
        Fruit f = find(id);
        if (f == null) {
            System.out.println("Product not found!");
            return;
        }
        int amount = f.getPrice() * quan;

        // Kiểm tra xem sản phẩm đã có trong đơn hàng chưa
        boolean found = false;
        for (Order order : cusOrder) {
            if (order.getId() == id) {
                // Nếu sản phẩm đã có trong đơn hàng, cộng số lượng
                order.setQuantity(order.getQuantity() + quan);
                order.setAmount(order.getPrice() * order.getQuantity());
                found = true;
                break;
            }
        }

        // Nếu sản phẩm chưa có trong đơn hàng, thêm món hàng mới vào
        if (!found) {
            Order newOrder = new Order(f.getId(), f.getName(), quan, f.getPrice(), amount);
            cusOrder.add(newOrder);  // Thêm đơn hàng vào danh sách
        }
    }

    public static void Shop() {
        FruitShop();
        ArrayList<Order> cusOrders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int id = -1;
            while (!Validate.isValidID(id) || id < 0) {
                id = scanner.nextInt();
            }
            int quan = Validate.GetQuantity();
            addOrder(cusOrders, id, quan);

            String choice = Validate.validateChoice();
            if (choice.equalsIgnoreCase("n"))
                break;
        }

        String cusName = Validate.GetName();
        if (orders.containsKey(cusName)) {
            orders.get(cusName).addAll(cusOrders);
        } else {
            orders.put(cusName, cusOrders);
        }
        cusOrders.clear();
    }

    public static void ViewOrders() {
        for (String customer : orders.keySet()) {
            ArrayList<Order> cusOrders = orders.get(customer);
            System.out.println(customer);
            for (Order order : cusOrders) {
                order.showOrder();
            }
            System.out.println();
        }
    }
}
