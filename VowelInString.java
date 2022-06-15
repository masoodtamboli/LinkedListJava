public class VowelInString {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = str.toCharArray();
        String res = "";
        for(char i : arr){
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                continue;
            }else{
                res += Character.toString(i);
            }
        }
        System.out.println(res);
    }
}
