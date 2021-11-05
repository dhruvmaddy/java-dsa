package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class PairStar {

    public static void main(String[] args) {
        String string = "aaaaaaaa";
        String result = pairStar(string);
        System.out.println("The new String is: "+result);
    }
    private static String pairStar(String string) {
        if(string.length()==1) {
            return string;
        }
        if(string.charAt(0) == string.charAt(1)) {
            return string.charAt(0)+"*"+pairStar(string.substring(1));

        } else {
            return string.charAt(0)+pairStar(string.substring(1));
        }

    }
}
