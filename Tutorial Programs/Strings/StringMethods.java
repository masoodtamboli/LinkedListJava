package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // StringBuilder builder = new StringBuilder();
        // builder.append("Hello");
        // builder.insert(1, "M");
        // System.out.println(builder);
        String str1 = "a";
        String str2 = "Masood";
        char[] test = new char[10];
        System.out.println(Arrays.toString(str2.getBytes()));
        str2.getChars(0, 4, test, 0);
        System.out.println(test);
    }
}
