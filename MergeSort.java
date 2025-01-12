public class MergeSort {


public static void display(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println("");
}
public static void main(String[] args) {
    int[] arr = {38, 27, 43, 3, 9, 82, 10};
    System.out.println("Unsorted array: ");
    display(arr);
    mergeSort(arr, 0, arr.length - 1);
    System.out.println("Sorted array: ");
    display(arr);
}

public static void mergeSort( int[] arr, int l, int r ) {
    int m = l + ( r - 1 ) / 2;

    mergeSort(arr, l, m );
    mergeSort(arr, m + 1, r);

    merge( arr, l , m, r );
}

public static void merge ( int[] arr, int l, int m, int r ) { 
    //tìm kích thước của hai mảng tạm thời
    int s1 =  m - 1 + 1;
    int s2 = r - m;

    //Tạo mảng tạm thời
    int[] L = new int[s1];
    int[] R = new int[s2];

    //Sao chép dữ liệu vào mảng tạm thời
    for ( int i = 0; i < s1; i ++ ) {
        L[i] = arr[l + i];
    }
    for ( int i = 0; i < s2; i ++ ) {
        R[i] = arr[m + 1 + i];
    }

    //Hợp nhất các mảng vào mảng tạm thời
    int i = 0, j = 0;
    int k = l;

    while (i < s1 && j < s2 ) {
        if ( L[i] > R[i] ) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

}
}
