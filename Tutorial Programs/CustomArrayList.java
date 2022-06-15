import java.util.Arrays;

public class CustomArrayList {
    int size = 0;
    int DEFAULT_SIZE = 10;
    private int[] arr;
    
    CustomArrayList(){
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        arr[size++] = num;
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        if(DEFAULT_SIZE == size){
            return true;
        }else{
            return false;
        }
        
    }

    public int get(int index){
        return arr[index];
    }

    public int size(){
        return size;
    }

    public int remove(){
        return arr[--size];
    }

    public void set(int index, Integer val){
        arr[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(arr) +", size= " + size + "}";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);   
    }
}
