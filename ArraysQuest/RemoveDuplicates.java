// Program to remove duplicates from an sorted array
package ArraysQuest;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2,3},
            {4,5,6,7},
            {8,7,5},
            {2}
        };
        System.out.println(arr1.length);
        int[] arr = {1,1,2,3,4,4,5,5};
        int i,j;
        for(i=0, j=1; j<arr.length;){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
        System.out.println(Arrays.toString(arr));
    }

    
}
