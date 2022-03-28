package com.company;

public class MultipliersOfThree {
    public static int displayMultipliers(int input){
        for(int counter = 3; counter <= input; counter = counter + 3){
            System.out.println("This is a multiplier of three : " + counter);
        }
       return input;
    }


    public static void main(String[] args){
        displayMultipliers(20);

    }
}
