package com.dhruv.codingninjas.javadsa.recursionAssignment.assignment;

public class StairCase {

    public static void main(String[] args) {
        int numofStairSteps = 4;
        int result = stairCase(numofStairSteps);
        System.out.println("The no of steps take to climp stair with "+numofStairSteps+" : "+result);
    }

    private static int stairCase(int numofStairSteps){
        if(numofStairSteps<0) {
            return 0;
        } else if( numofStairSteps==0){
            return  1;
        } else {
            return stairCase(numofStairSteps-1)+stairCase(numofStairSteps-2)+stairCase(numofStairSteps-3);
        }
    }
}
