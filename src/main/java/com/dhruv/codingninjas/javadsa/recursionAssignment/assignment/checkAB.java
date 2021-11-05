package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class checkAB {
    public static void main(String[] args) {
        String string ="abbaa";
        boolean result = checkABs(string);
        System.out.println("The given String follows rule: "+result);
    }

    private static boolean checkABs(String string) {
        if(string.length() ==0) {
            return true;
        }
        if(string.charAt(0) != 'a') {
            return false;
        }
        if(string.length() >= 3 && string.substring(0,3)=="abb") {
            return checkABs(string.substring(3));
        }
        else {
            return checkABs(string.substring(1));
        }
    }
}
