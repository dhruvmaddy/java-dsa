package com.dhruv.codingninjas.javadsa.recursion2.problem;

public class RemoveX {

    public static void main(String[] args) {
        String string = "xabxcxd";
        char chartobeRemove ='x';
        String result = removeX(string, chartobeRemove);
        System.out.println("The new String is: "+result);
    }

    public static String removeX(String string, char chartobeRemove) {
        if(string.length()==0) {
            return string;
        }
        String smallOutput = removeX(string.substring(1), chartobeRemove);
        if(string.charAt(0) == chartobeRemove) {
            return smallOutput;
        } else {
            return string.charAt(0)+smallOutput;
        }
    }
}
