package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class StringtoNumber {

    public  static void  main(String[] args) {
        String string = "348765";
        int result = convertStringToNumber(string);
        System.out.println("The numeric value of given string "+string+" is: "+result);
    }
    private static int convertStringToNumber(String string) {
        if(string.length() == 1) {
            return (string.charAt(0)-'0');
        }
        int result = (int)((string.charAt(0)-'0')*(Math.pow(10, string.length()-1)))+ convertStringToNumber(string.substring(1));
        return  result;
    }
}
