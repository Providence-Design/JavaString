package com.company;

public class ArrayReverse {
    public static char[] reverse(char[] input){
        //swap position 0 with 4 and then position 1 with 3
        //swap input[0] input[4]
//        char a = input[0];
//        input[0] = input[4];
//        input[4] = a;
//
//        char b = input[1];
//        input[1] = input[3];
//        input[3] = b;

        int j = input.length -1;
        for(int i = 0; i < input.length/2; i++){
            //System.out.println("The character at index " +  i + " of input is : " + input[i]);
            //System.out.println("The character at index " + j + " of input is : " + input[j]);
            char a = input[i];
            input[i] = input[j];
            input[j] = a;
            j--;
            //todo write a for loop to swap 0 with 4 then 1 with 3
            //first start from zero to 4 and 1 to 3
        }

        return input;

    }
    public  static void main(String[] args){
        char[] charArray = {'C', 'o', 'n', 'j', 'u', 'n', 'c', 't', 'i', 'o', 'n'};
        char[] result = reverse(charArray);
        System.out.println(result);
    }
}
