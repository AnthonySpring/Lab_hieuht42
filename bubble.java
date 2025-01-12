import java.util.*;

public class bubble {
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

    private int[] random(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public void display(String message, int[] arr) {
        System.out.println(message);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubble bb = new bubble();
        int size = bb.checkInput();
        int[] array = bb.random(size);

        bb.display("Array before sorting:", array);
        bb.bubbleSort(array);
        bb.display("Array after sorting:", array);
    }
}