package ca.ciccc.wmad.assignment7.question1;

public class Student {

    private String studentName;
    private Integer studentId;
    private Integer studentAge;

    public Student(String studentName, Integer studentId, Integer studentAge) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }
}

