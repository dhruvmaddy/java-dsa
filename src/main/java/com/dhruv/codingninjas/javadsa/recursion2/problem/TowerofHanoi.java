package com.dhruv.codingninjas.javadsa.recursion2.problem;

public class TowerofHanoi {

    public static void main(String[] args) {

        int numDisks =3;
        towerofHanoi(numDisks, "Source", "Destination", "Helper");
    }

    private static  void towerofHanoi(int numDisks, String source, String destination, String helper) {
        if(numDisks == 1) {
            System.out.println("Move Disk"+numDisks+" from " +source+" to "+destination);
            return ;
        }
        towerofHanoi(numDisks-1, source, helper,destination);
        System.out.println("Move "+numDisks+"th from "+source +" to "+destination);
        towerofHanoi(numDisks-1, helper, source, destination);
    }
}
