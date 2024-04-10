import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator it = numbers.iterator();
        System.out.print("iterator");
        while (it.hasNext()){
            int value = (int)it.next();
            if (value == 30){
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(numbers);

        System.out.print("for");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }


}
