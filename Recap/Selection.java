package Recap;
import java.util.*;
public class Selection {
    static void selection(int[] arr){
        int min_idx;
        for(int i=0; i<arr.length; i++){
            min_idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
    }
}
