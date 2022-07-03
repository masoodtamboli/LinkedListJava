package Heap;

import java.util.*;

public class Heap {

    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l <= n && arr[l] > arr[largest]){
            largest = l;
        }

        if(r <=n && arr[r] > arr[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        arr[0] = 14;
        arr[1] = 24;
        arr[2] = 12;
        arr[3] = 11;
        arr[4] = 25;
        arr[5] = 8;
        arr[6] = 35;
        int n = 7;

        for(int i=0; i<n/2; i++){
            heapify(arr, n, i);
        }

        System.out.println(Arrays.toString(arr));

    }
}
