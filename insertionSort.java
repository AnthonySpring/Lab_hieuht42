
public class insertionSort {
    public int[] InsertionSort ( int[] arr ) {
       for ( int i = 1; i < arr.length; i++ ) {
            int key = arr[i];
            int j;

            for ( j = i - 1; j >= 0 && arr[j] > key; j -- ) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
       }
       return arr;
    }

    public void swap( int[] arr, int a, int b ) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public void display (int[] arr){
        for ( int i = 0; i < arr.length; i ++ ) {
            System.out.print(arr[i]);
            if ( i != arr.length - 1 ) { 
                System.out.print(" ");
            }
            
        }
        System.out.println("");
    }
    public static void main( String[] args ) {
        insertionSort its = new insertionSort();
        int[] arr = {2, 1, 5, 7, 8, 9, 34, 1231, 67, 463, 31231, 543567};
        its.display(arr);
        its.InsertionSort(arr);
        its.display(arr);
       
    }
}
