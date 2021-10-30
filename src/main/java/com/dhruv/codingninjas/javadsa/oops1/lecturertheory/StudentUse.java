package com.dhruv.codingninjas.javadsa.oops1.lecturertheory;

public class StudentUse {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1);

        student1.setName("dhruv");
        student1.setRollNumber(887);
        System.out.println("Student 1 Details: "+student1.getName()+" : "+student1.getRollNumber());

        student2.setName("Roushan");
        student2.setRollNumber(753);
        System.out.println("Student 2 Details: "+student2.getName()+" : "+student2.getRollNumber());
    }
}
