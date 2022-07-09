package ca.ciccc.wmad.assignment5.question1;

import java.util.ArrayList;

public class Test {
    public void test(){
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(80);
        grades1.add(78);
        grades1.add(65);
        grades1.add(34);

        Student student1 = new Student("77889911", grades1, "Dave");

        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(87);
        grades2.add(63);
        grades2.add(45);
        grades2.add(91);

        Student student2 = new Student("66553322", grades2, "James");

        System.out.println("Hello world");
        System.out.println(student1.calculateGPA());
        student2.calculateGPA();

        student1.compareGPA(student2);

        student1.printStudentInfo();
    }
}
