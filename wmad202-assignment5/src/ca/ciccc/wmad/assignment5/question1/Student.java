package ca.ciccc.wmad.assignment5.question1;

import java.util.ArrayList;
public class Student {

    private String studentID;
    private ArrayList<Integer> grades;
    private String name;

    public Student(String studentID, ArrayList<Integer> grades, String name){
        this.studentID = studentID;
        this.grades = grades;
        this.name = name;
    }

    public Student(String studentID, String name){
        this.studentID = studentID;
        this.grades = new ArrayList<>();
        this.name = name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double calculateGPA(){
        double gpa = -1;

        if(this.grades.size() > 0) {
            int sum = 0;
            for(int grade : grades){
                sum += grade;
            }
            gpa = (1.0 * sum) / grades.size();
        } else{
            System.out.println("No GPA calculated as there is no grades");
        }
        return gpa;
    }

    public void printStudentInfo(){
        System.out.println(this.toString());
    }

    public int compareGPA(Student otherStudent){
        double studentGPA = this.calculateGPA();
        double otherStudentGPA = otherStudent.calculateGPA();
        if(studentGPA > otherStudentGPA){
            System.out.println(this.name+ " has a higher GPA");
            return 1;
        }
        else if(studentGPA < otherStudentGPA){
            System.out.println(otherStudent.getName()+ "has a higher GPA");
            return -1;
        }
        else{
            System.out.println("Equals GPA");
            return 0;
        }
    }

    public String toString(){
        String description = "";

        description = description + "ID: " + this.studentID +"\n"+
                "Name: " + this.name + "\n"+
                "Grades: {";
        for(int i=0; i < this.grades.size(); i++){
            description = description + grades.get(i);
            if(i<this.grades.size()-1){
                description = description + ",";
            }
        }
        description = description + "}";
        return description;
    }

    public String getName(){
        return this.name;
    }




}
