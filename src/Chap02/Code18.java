package Chap02;
import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        // Code14이랑 같은데 bubbleSort(); 메소드를 만들어서 하게 만드는 것이 다름
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i]= kb.nextInt();
        }
        kb.close();

        bubbleSort(n, data);

        //bubble sort

        System.out.println("Sorted data");
        for(int i=0; i<n; i++){
            System.out.println(data[i]+ " ");
        }

    }

    static void bubbleSort(int n, int[] data){
        // 아무것도 리턴할 필요가 없기 때문에 void
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(data[j]>data[j+1]){
                    // swap data[j] and data[j+1]
                    int tmp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
        }
    }


}
