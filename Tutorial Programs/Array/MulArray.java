package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MulArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Array");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("Output: ");

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println("");
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        // for(int[] a : arr){
        //     for(int k : a){
        //         System.out.print(k+ " ");
        //     }
        //     System.out.println();
        // }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        sc.close();

    }
}
