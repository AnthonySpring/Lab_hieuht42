//display a array of 45 elements from fibonacci
public class Fibonacci {    
    public int[] fibonacci (int[] arr) {
        arr[0]  = 0;
        arr[1] = 1;
        for ( int i = 2; i < arr.length; i ++ ) {
            arr[i] = arr[i - 2] + arr [ i - 1 ];
        }
        return arr;
    }
    
    public void display(int[] arr){
        for (int i = 0 ; i < arr.length; i ++ ) {
            System.out.print(+ arr[i] );
            if ( i != arr.length - 1)
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        // gen a array containing all elements
        int[] arr = new int[45];
        System.out.println("The 45 sequence fibonacci: ");
        fibo.fibonacci(arr);
        fibo.display(arr);
    }
   
}
