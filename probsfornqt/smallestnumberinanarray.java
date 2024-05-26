public class smallestnumberinanarray {
    public static void main(String[] args) {
        int arr1[] = {2,4,3,1,0};
        System.out.println("the smallest element in an array:" + SmallestNums(arr1));
    }
    static int SmallestNums(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
