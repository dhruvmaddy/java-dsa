package com.dhruv.codingninjas.javadsa.oops1.lecturertheory.gettersetter;

import com.dhruv.codingninjas.javadsa.oops1.lecturertheory.gettersetter.Student;

public class StudentUse {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        student1.setName("dhruv");
        student1.setRollNumber(887);
        student1.setCgpa(8.4);
        System.out.println("Student 1 Details: "+student1.getName()+" : "+student1.getRollNumber()+" : "+student1.getCgpa()*student1.getConversionFactor()+" : "+ student1.getNumStudent());
        Student student2 = new Student("Roushan", 753, 7.2);
        student2.setName("Roushan");
        student2.setRollNumber(753);
        System.out.println("Student 2 Details: "+student2.getName()+" : "+student2.getRollNumber()+" : "+student2.getCgpa()*student2.getConversionFactor()+" : "+student2.getNumStudent());
    }
}
