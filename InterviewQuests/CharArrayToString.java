package InterviewQuests;

public class CharArrayToString {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e'};

        String str = "";

       for(char c : arr){
        str += c;
       }
       System.out.println(str);
    }
}
