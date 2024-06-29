package Class01;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // Student 타입을 받을 student1이라는 변수를 선언
        student1 = new Student(); // 메모리에 Student라는걸 만듬
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        /*
        student1 은 Student의 인스턴스이다.
        즉 특정 클래스와의 관계를 명확히 할 때 인스턴스라는 용어를 주로 사용!
        *** 모든 인스턴스는 객체이지만 인스턴스라고 부르는 순간은 특정 클래스로부터 그 객체가 생성되었음을 강조하고 싶을 떄.

        EX: student1은 객체이지만 이 객체가 Student클래스로부터 생성되었다는 것을
            명확히 하려고 student1은 Student의 인스턴스라고 부름.
         */

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade= 80;

        // student1, 2의 참조값 확인
        System.out.println(student1); //Class01.Student@2812cbfa
        System.out.println(student2); //Class01.Student@2acf57e3aq

        System.out.println("이름: "+student1.name+"나이: "+student1.age+"성적:"+student1.grade);
        System.out.println("이름: "+student2.name+"나이: "+student2.age+"성적:"+student2.grade);
    }
}
