package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MulArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
        
        for(int j=0; j<3; j++){
            for(int k=0; k<3; k++)
                list.get(j).add(sc.nextInt());
        }

        System.out.println(list);
        sc.close();
    }
}
