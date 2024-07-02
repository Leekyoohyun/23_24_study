package testAnything;

public class StudentMain1 {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("학생1", 17, 90);
        StudentInfo student2 = new StudentInfo("학생2", 16, 70);
        StudentInfo student3 = new StudentInfo("학생3", 19, 100);

        StudentInfo[] students = {student1,student2,student3};

        //initMember가 필요가 없네 ㅋㅋ

        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }
}
