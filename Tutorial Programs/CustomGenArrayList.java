import java.util.Arrays;

public class CustomGenArrayList<T> {
    int size = 0;
    int DEFAULT_SIZE = 10;
    private Object[] arr;
    
    CustomGenArrayList(){
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        arr[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[arr.length * 2];
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

    public Object get(int index){
        return (Object)arr[index];
    }

    public int size(){
        return size;
    }

    public Object remove(){
        Object removed = (Object)(arr[--size]);
        return removed;
    }

    public void set(int index, T val){
        arr[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(arr) +", size= " + size + "}";
    }

    
    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);   
    }
}
