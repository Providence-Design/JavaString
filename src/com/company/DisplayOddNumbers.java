package com.company;

public class DisplayOddNumbers {
    public static int  displayOddNumbers(int input){
//        for(input = 0;  input <= 20; input++){
//            if(input % 2 == 1){
//                System.out.println("The input is an odd number " + input);
//            }
        for(int i = 0;  i <= input; i++){
           if(i % 2 == 1){
                System.out.println("The input is an odd number " + i);
           }
        }
        return input;
    }
    public static void main(String[] args){
        displayOddNumbers(20);


    }
}
