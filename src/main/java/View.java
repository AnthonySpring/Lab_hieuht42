import java.util.Scanner;

public class View {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===================== Welcome to fruit manager program ====================");
            System.out.println("1. Add a fruit (Seller)");
            System.out.println("2. View orders (Seller)");
            System.out.println("3. Shopping (Customer)");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Controller.AddFruit();
                    break;
                case 2:
                    Controller.ViewOrders();
                    break;
                case 3:
                    Controller.Shop();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        run();
        // Add some initial fruits for testing
        Controller.fruits.add(new Fruit(1, "Banana", 10, "Vietnam"));
        Controller.fruits.add(new Fruit(2, "Apple", 20, "Vietnam"));
        Controller.fruits.add(new Fruit(3, "Orange", 15, "USA"));
    }
}
