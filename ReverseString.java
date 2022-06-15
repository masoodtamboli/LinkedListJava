class ReverseString {
    public static void main(String[] args) {
        String str1 = "123";
        char[] arrOfString = str1.toCharArray();
        String res = "";
        for(int i=arrOfString.length-1; i>=0; i--){
            res += arrOfString[i];
        }
        System.out.println(res);
    }
}