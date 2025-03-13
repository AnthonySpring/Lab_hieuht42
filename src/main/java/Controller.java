import javax.sound.midi.MidiMessage;
import javax.swing.plaf.basic.BasicBorders;
import java.util.ArrayList;
import java.util.HashMap;

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
    }

    public static void FruitDisplay() {
        for (Fruit fruit : fruits) {
            fruit.toString();
        }
    }

    public static void FruitShop(){
        for (Fruit fruit : fruits){
            fruit.shopList();
        }
    }
    public static void Shopping(){
        //Can hien thi mot danh sach day du va shop
        Shop();


    }
    public static Fruit find(int id){
        Fruit temp = new Fruit();
        for (Fruit fruit : fruits){
            return (fruit.getId() == id) ? fruit : temp;
        }
        return temp;
    }

    public static void addOrder(ArrayList<Order> customerOrder, int id, int quan){
        Fruit f = find(id);
        int amount = f.getPrice()*quan;
        Order newOrder = new Order(f.id, f.getName(), quan, f.getPrice(), amount);
    }
    public static void Shop(){
        ArrayList<Order> cusOrders = new ArrayList<>();
        while(true){
            int id = -1;
            while(!Validate.isValidID(id)){
                id = Validate.GetID();
            }
            int quan = Validate.GetQuantity();
            addOrder(cusOrders, id, quan);

            String choice = Validate.GetName();
            if (choice.equalsIgnoreCase("n"))
                break;
        }

        String cusName = Validate.GetName();
        if (orders.containsKey(cusName))
            orders.get(cusName).addAll(cusOrders);
        else
            orders.put(cusName, cusOrders);
        cusOrders.clear();
    }
    public static void ViewOrder(){
        for (String customer : orders.keySet()){
            ArrayList<Order> cusOrders = orders.get(customer);
            System.out.println(customer);
            for (Order order : cusOrders){
                order.showOrder();
            }
            System.out.println();
        }
    }

//    public static void Shop() {
//        ArrayList<Order> customerOrders = new ArrayList<>();
//        while (true) {
//            int id = -1;
//            while (!Validate.isValidID(id)) {
//                id = Validate.GetID();
//            }
//            int quan = Validate.GetQuantity();
//            addOrder(customerOrders, id, quan);
//            // Hỏi khách hàng có muốn tiếp tục mua không
//            System.out.println("Do you want to add more items to your order? (Y/N)");
//            String choice = Validate.GetName();
//            if (choice.equalsIgnoreCase("N")) {
//                // Nếu khách hàng chọn "N", kết thúc việc nhập đơn hàng và tiếp tục
//                break;  // Dừng lại khi khách hàng chọn "N"
//            }
//        }
//        String cusName = Validate.GetName();
//        if (orders.containsKey(cusName)){
//            orders.get(cusName).addAll(customerOrders);
//        } else {
//            orders.put(cusName, customerOrders);
//        }
//        customerOrders.clear();
//    }
}
