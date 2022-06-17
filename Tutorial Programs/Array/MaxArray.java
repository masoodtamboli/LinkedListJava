package Array;

public class MaxArray {

    public static int maxInArray(int[] arr) {
        int maxVal = 0;
        for (int a : arr) {
            if (a > maxVal)
                maxVal = a;
        }

        return maxVal;
    }

    public static int maxInArrayRange(int[] arr, int start, int end) {
        int maxVal = 0;
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 35, 4, 3, 4, 6, 6, 4, 3, 3, 5656 };

        System.out.println(maxInArray(arr));
        System.out.println(maxInArrayRange(arr, 1, 7));
    }
}
