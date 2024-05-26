public class largestnum {
    public static void main(String[] args) {
        int arr1[] = {8,9,10,5,90};
        System.out.println("the largest number of this array:"+ Largestnums(arr1));
    }
    static int Largestnums(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if (arr[i]>max){
                arr[i] = max;
            }
        }
        return max;
    }
}
