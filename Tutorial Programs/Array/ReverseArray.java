package Array;

public class ReverseArray {

    public static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};

        for (int i = 0, j = arr.length - 1; i < arr.length / 2 && j > arr.length / 2; i++, j--) {
            swap(arr, i, j);
        }

        for (int a : arr)
            System.out.print(a + " ");
    }
}
