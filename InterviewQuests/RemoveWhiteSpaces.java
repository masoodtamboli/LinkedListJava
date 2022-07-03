package InterviewQuests;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Hello Masood Its me";
        String newStr = "";
        char[] arr = str.toCharArray();
        for(char c : arr){
            if(!Character.isWhitespace(c)){
                newStr+=c;
            }  
            
            // System.out.println(c);
        }

        System.out.println(newStr);
    }
}
