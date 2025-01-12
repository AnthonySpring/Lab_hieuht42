import java.util.*;

public class selectionSort {
        public Scanner sc = new Scanner(System.in);
    public int checkInput() {
        int size = -1;
        do {
            try {
                System.out.println("Enter size of array: ");
                size = sc.nextInt();
                if (size <= 0) {
                    System.out.println("Size must be a positive number between " + 1 + " and " + Integer.MAX_VALUE);
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid Input!");
                sc.next(); // Clear invalid input
            }
        } while (true);

        return size;
    }

    public int[] random(int size) {
        Random r = new Random();
        int[] arr = new int[size];
        for ( int i = 0 ; i < size; i ++ ) {
            arr[i] = r.nextInt(size);
        }
        return arr;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int[] sort(int[] arr) {
        for ( int i = 0; i < arr.length; i ++ ) {
            for ( int j = i + 1; j < arr.length -1; j ++ ) {
                if ( arr[i] > arr[j] ) 
                    swap(arr, i, j);
            }
        }

        return arr;
    }

    public void display(int[] arr) {
        for ( int i = 0 ; i < arr.length; i ++ ){
           if ( i != arr.length - 1)
                System.out.print(+ arr[i] + " ");
            
    }
    System.out.println("");
    }
    
    public static void main(String[] args) {
        selectionSort s = new selectionSort();
        int size = s.checkInput();
        int[] arr = s.random(size);
        s.display(arr);
        s.sort(arr);
        s.display(arr);
    }
}
