package testAnything;

import refVarChanges.Student;

public class StudentInfo {
    String name;
    int age;
    int grade;

    public StudentInfo(String name, int age, int grade){ //생성자
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void initStudent(StudentInfo studentInfo, String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void printStudent(){
        System.out.println("이름:"+this.name+" 나이:"+this.age+" 성적:"+this.grade);
    }
}
