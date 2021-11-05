package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class Palindrome {

    public static void main(String[] args) {
        String string = "jahaja";
        boolean isPalindrome = palindrome(string);
        System.out.println("String "+string+ " is Palindrome: "+isPalindrome);
    }

    private static boolean palindrome(String string) {
        if(string.length() == 1 && string.length()==0) {
            return true;
        }
        if(string.charAt(0) == string.charAt(string.length()-1)) {
            boolean result = palindrome(string.substring(1,string.length()-2));
            return true;
        } else{
            return false;
        }
    }
}
