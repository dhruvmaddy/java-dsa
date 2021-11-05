package com.dhruv.codingninjas.javadsa.recursion2.lecturertheory;

public class ReplaceChar {

    public static void main(String[] args) {
        String string = "dhruv prakash";
        char oldChar = 'a';
        char newChar ='z';
        String result = replaceChar(string, oldChar, newChar);
        System.out.println("The new String is: "+result);
    }

    public static String replaceChar(String string, char oldChar, char newChar) {
        if(string.length()==0){
            return string;
        }
        String smallOutput = replaceChar(string.substring(1), oldChar,newChar);
        if(string.charAt(0) == oldChar) {
            return newChar+smallOutput;
        } else {
            return string.charAt(0)+smallOutput;
        }

    }
}
