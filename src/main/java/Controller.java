import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
    public static ArrayList<Fruit> fruits = new ArrayList<>();
    public static HashMap<String, ArrayList<Fruit>> orders = new HashMap<>();

    public static void AddFruit() {
        int id = Validate.GetID();
        String name = Validate.GetName();
        int price = Validate.GetPrice();
        String place = Validate.GetPlace();
        Fruit p = new Fruit(id, name, price, 999999, place);
        fruits.add(p);
    }

    public static void FruitDisplay() {
        for (Fruit fruit : fruits) {
            fruit.toString();
        }
    }

    public static void FruitListDisplay() {
        for (Fruit fruit : fruits) {
            fruit.fruit();
        }
    }

    public static void Shopping() {
        Scanner sc = new Scanner(System.in);
        FruitListDisplay();
        int id = -1;
        while (!Validate.isValidID(id) && id <= 0) {
            id = Validate.GetID();
        }
        Fruit product = FindID(id);
        int quan = Validate.GetQuantity();
        long total = product.getPrice() * quan;

    }
    public static Fruit FindID(int id) {
        Fruit temp = new Fruit();
        for (Fruit fruit : fruits) {
            if (fruit.getId() == id)
                temp =  fruit;
        }
        return temp;
    }
}
