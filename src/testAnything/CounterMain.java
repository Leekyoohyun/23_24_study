package testAnything;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
        counter.increment();

        // counter.count = 1;
        // 'count' has private access in 'testAnything.MaxCounter' 접근 불가능
    }
}
