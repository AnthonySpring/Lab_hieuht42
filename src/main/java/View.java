public class View {
    public static void run(){
        while(true){
            System.out.println("=====================Welcome to fruit manager programm================");
            System.out.println("1. Add a fruit (Seller)");
            System.out.println("2. View orders (Seller)");
            System.out.println("3. Shopping (Customer)");
            System.out.println("4. Exit");
            int choice = Validate.GetChoice();
            switch (choice){
                case 1 :
                    Controller.AddFruit();
                    break;
                case 2 :
                    Controller.ViewOrder();
                    break;
                case 3 :
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
        }

    }

