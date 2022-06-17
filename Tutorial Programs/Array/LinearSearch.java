package Array;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                return i;
            }

        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int high = arr.length - 1;
        int low = 0;
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            mid = (high + low) / 2;
            if (arr[mid] == target)
                return mid;

            if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // public static int binarySearchRec(int[] arr, int target, int low, int high){
    //     while(low < high){

    //     }
    // }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int target = 3;
        // // System.out.println(linearSearch(arr, target));
        // System.out.println(binarySearch(arr, target));

        int k = (int)3.7;
        System.out.println(k);
    }
}
