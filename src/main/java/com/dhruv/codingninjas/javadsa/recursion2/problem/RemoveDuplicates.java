package com.dhruv.codingninjas.javadsa.recursion2.problem;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String string = "aaaaabbbbcccdde";
        String result = removeDuplicates(string);
        System.out.println("The new String is: "+result);
    }

    private static String removeDuplicates(String string){
        if(string.length() <=1) {
            return string;
        }
        String smallOutput = removeDuplicates(string.substring(1));
        if(string.charAt(0)== string.charAt(1)) {
            return smallOutput;
        } else {
            return string.charAt(0)+ smallOutput;
        }
    }

}
