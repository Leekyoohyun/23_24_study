package access.examples;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(count>=max){
            System.out.println("최댓값 초과할 수 없음");
            return;
        }
        count++;
    }
    public int getCount(){
        return count;
    }


}
