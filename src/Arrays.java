public class Arrays {
    public static void main(String[] args){
        int[] foo = new int[5];
        System.out.println("(1):  "+foo.length);     // (1)

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
