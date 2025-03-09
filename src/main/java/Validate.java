import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
public class Validate {
    public static int GetID(){
        Scanner scanner = new Scanner(System.in);
        int id = -1;
        while (true){
            try{
                System.out.println("Enter fruit's ID : ");
                id = scanner.nextInt();
                if(id>0)
                    break;
            } catch (InputMismatchException exception){
                System.out.println("Invalid input !");
                scanner.nextLine();
            }
        }
        return id;
    }
    public static String GetName(){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (true){
            try{
                System.out.println("Enter fruit's name : ");
                name = scanner.nextLine();
                if(!name.isEmpty())
                    break;
            } catch (NoSuchElementException exception){
                System.out.println("Invalid input !");
                scanner.nextLine();
            }
        }
        return name;
    }
    public static int GetPrice(){
        Scanner scanner = new Scanner(System.in);
        int price = -1;
        while (true){
            try{
                System.out.println("Enter fruit's price : ");
                price = scanner.nextInt();
                if(price > 0) break;
            } catch (InputMismatchException exception){
                System.out.println("Invalid input !");
                scanner.nextLine();
            }
        }
        return price;
    }
    public static int GetQuantity(){
        Scanner scanner = new Scanner(System.in);
        int quan = -1;
        while (true){
            try{
                System.out.println("Enter fruit's quantity : ");
                quan = scanner.nextInt();
                if(quan > 0) break;
            } catch (InputMismatchException exception){
                System.out.println("Invalid input !");
                scanner.nextLine();
            }
        }
        return quan;
    }
    public static String GetPlace(){
        Scanner scanner = new Scanner(System.in);
        String place = "";
        while (true){
            try{
                System.out.println("Enter fruit's origination : ");
                place = scanner.nextLine();
                if(!place.isEmpty())
                    break;
            } catch (NoSuchElementException exception){
                System.out.println("Invalid input !");
                scanner.nextLine();
            }
        }
        return place;
    }
    public static boolean isValidID(int id){
        for (Fruit fruit : Controller.fruits){
            if (fruit.getId() == id)
                return false;
        }
        return true;
    }
}
