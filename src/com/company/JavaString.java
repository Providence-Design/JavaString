package com.company;

import java.io.PrintStream;

public class JavaString {

    public static String reverse(String input){
        StringBuilder sb = new StringBuilder();

        // 4, 3, 2, 1,0,-1,-2,-3
        for(int i = input.length() - 1; i >= 0; i--){
            char c = input.charAt(i);
            sb.append(c);
            System.out.println(c);
        }
        return sb.toString();

    }

    public static void main(String[] args){
        String firstString = "Hello";
        String result = reverse(firstString);

        PrintStream video = System.err;
        video.print("The reverse is " );
        video.println(result);


    }
}
