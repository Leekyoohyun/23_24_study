package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){ // 이게 생성자야
        System.out.println("생성자 호출 name="+name+" ,age="+age+" ,grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age){ // 생성자 추가!
        this.name = name;
        this.age = age;
        this. grade = 50; //50으로 하고 시작
    }

    MemberConstruct(String name){ //또 추가
        this(name, 0,50);
    }
}
