public class Arrays {
    public static void main(String[] args){
        int[] foo = new int[5];


        // int: data type, foo: array name, new: 객체 생성 Operator, [5]와 [] : 배열이라는 표시 및 배열크기
        // 배열과 반복
        int k=0;
        int[] numbers1 = new int[4];
        while (numbers1.length > k){
            System.out.println(numbers1[k]);
            k++;
        }















        System.out.println("(1):  "+foo.length);     // (1)
        System.out.println("(4):  "+foo.length);
        double[] squares;       // Declaration
        squares = new double[100];      // Creation
        for (int i=0; i<squares.length; i++){
            squares[i] = i*i;   // Type promotion
        }
       // System.out.println("(2):  "+squa);    // (2)


        // System.arraycopy

        int[] srcArray = {1,2,3,4,5};
        int[] destArray = {101,102,103,104,105,106,107};
        System.arraycopy(srcArray, 1, destArray, 2, 3);
        for(int i=0; i<destArray.length; i++){
            System.out.print(destArray[i]+", ");   // (3)
        }
    }



}
