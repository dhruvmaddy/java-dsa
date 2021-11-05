package com.dhruv.codingninjas.javadsa.recursion2.lecturertheory;

public class RepalcePi {

    public static void main(String[] args) {
        String string = "apibpicpi1pi2pi3pi";
        String stringtobeRepalce = "3.14";
        String result = replacePi(string, stringtobeRepalce);
        System.out.println("The new String is: "+result);
    }

    private static String replacePi(String string, String stringtobeRepalce) {
        if(string.length() <= 1) {
            return string;
        }

        if(string.charAt(0) == 'p' && string.charAt(1) == 'i') {
            String smallOutput = replacePi(string.substring(2), stringtobeRepalce);
            return "3.14"+smallOutput;
        } else {
            String smallOutput = replacePi(string.substring(1), stringtobeRepalce);
            return string.charAt(0)+smallOutput;
        }
    }
}
