package Class01;

public class ClassStart5 {
    public static void main(String[] args) {
        // ClassStart4을 Loop 로 해보기

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for(int i=0; i<students.length;i++){
            System.out.println("이름: "+students[i].name+"나이: "+students[i].age+"성적:"+students[i].grade);
        }

        System.out.println("------- 더 좋은 방법 -------");

        for(int i=0;i<students.length;i++){
            Student s= students[i]; // 반복해서 사용하는 객체를 Students s라는 변수에 담아두고 사용해도 ㄱㅊ
            System.out.println("이름: "+s.name+" 나이: "+s.age+" 성적: "+s.grade);
        }

        System.out.println("------- 향상된 For문 -------");
        for(Student s : students){
            System.out.println("이름: "+s.name+" 나이: "+s.age+" 성적: "+s.grade);
        }

        System.out.println("------ 참조값 출력 ------");
        System.out.println(students[0]); // 참조값 출력
    }
}
