package practice;

public class reversearrayusingrecursion {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,4,5};
        reverseArray(arr,0,n-1);
        printArray(arr,n);
    }
    static void printArray(int arr[], int n){
        System.out.println("Reverse array is: ");
        for (int i = 0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static void reverseArray(int arr[], int start, int end){
        if (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr,start + 1, end - 1);
        }
    }
}
