import java.util.Arrays;
public class Insertion_Sort2ndSol {


    public static void main(char[] A) {
        int n = A.length;
        for (int k = 1; k < n; k++) {
            int j = k;
            while (j > 0 && A[j - 1] > A[j]) {
                swap( A[j - 1] A[j - 1]);
                j = j - 1;
            }
        }
    }

    public static void swap(char[] A, int i, int j) {
        char temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
