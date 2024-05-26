import java.util.Arrays;

public class smallestnum {
    public static void main(String[] args) {
        int arr1[] = {2, 5, 9, 8, 1};
        System.out.println("the smallest number in an array :" + sort(arr1));

    }
    static int sort (int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

}
