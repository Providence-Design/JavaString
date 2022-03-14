package com.company;

import java.io.PrintStream;

public class JavaString {

    public static String reverse(String input){
        StringBuilder sb = new StringBuilder(input);

        int length = sb.length();
        StringBuilder result = sb.reverse();

        //char first = sb.charAt(0);
        //sb.setCharAt(0, sb.charAt(length-1));
        // sb.setCharAt(length-1, first);

        //String reverseResult = sb.toString();
        // return reverseResult;
        return sb.toString();
    }

    public static void main(String[] args){
        String firstString = "Hello";
        String result = reverse(firstString);

        PrintStream video = System.err;
        video.print("The reverse is " );
        video.println(result);
        String secondString = "olleH";
        video.println(reverse(secondString));

    }
}
