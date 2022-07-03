package Recap;
import java.util.*;

public class Bubble1 {
    public static void main(String[] args) {
        int[] arr = {90,47,86,98,37,37,1};
        bubble(arr);
        // System.out.println("Hello");
    }

    static void bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
