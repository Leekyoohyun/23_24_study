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
    }
}
