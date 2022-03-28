package com.company;

public class NumbersDivisibleByFour {
    public static int displayNumbersDivisibleByFour(int input){
        for(int numb = 0; numb <= input; numb++  ){
            if(numb % 4 == 0) {
                System.out.println("Number divisible by 4:" + numb);
            }
        }
        return input;
    }
    public static void main(String[] args){
        displayNumbersDivisibleByFour(30);

    }
}
