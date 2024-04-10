import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListInJava {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>(); // 리스트 생성, <> 빈칸은 형식 맞춰준것
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("add(값) ");
        System.out.println(numbers);

        numbers.add(1,50);
        System.out.println("(인덱스, 값 ");
        System.out.println(numbers);

        numbers.remove(4);
        System.out.println("remove(값) ");
        System.out.println(numbers);

        System.out.println("-----------------------");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(100);
        numbers2.add(200);
        numbers2.add(500);
        numbers2.add(400);
        System.out.println("arraylist 생성 :"+numbers2);

        numbers2.add(2, 300);
        System.out.println("arraylist에 추가 :"+numbers2);

        numbers2.remove(3);
        System.out.println("arraylist index 3번 삭제: "+ numbers2);

        System.out.println("Get :"+numbers2.get(2));
        System.out.println("데이터 크기(size) :"+numbers2.size());
    }
}
