package practice;

import java.util.Arrays;
import java.util.Collections;

public class reversearray {
    public static void main(String[] args) {
        int n = 5;
        Integer arr[] = {2,3,4,5,6};
        reverseArray(arr);
        printArray(arr,n);
    }
    static void printArray(Integer arr[], int n){
        System.out.println("Reversed array is: \n");
        for (int i = 0;i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void reverseArray(Integer arr[]) {
        //reverse the array by library function
        //reversing the fetched object
        Collections.reverse(Arrays.asList(arr));
    }


}
