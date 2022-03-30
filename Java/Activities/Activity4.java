package Activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String []ar) {
        int[] arr = {3,1,8,4,9,6,2};

        System.out.println("Original array :: "+ Arrays.toString(arr));

        sortAscOrder(arr);

        System.out.println("Sorted in Ascending order :: "+Arrays.toString(arr));
    }

    static void sortAscOrder(int[] arr) {

        for( int i = 1 ; i < arr.length;i++) {
            int ele = arr[i];
            int j= i-1;

            while ( j>= 0 && ele < arr[j]) {
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]=ele;
        }
    }
}
