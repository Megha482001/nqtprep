package practice;

public class smallest {
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,4,5};
        System.out.println("the smallest element in the array:" + Smallestnums(arr));
    }
    static int Smallestnums(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}
