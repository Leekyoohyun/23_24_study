package access.b;

import access.a.PublicClass;
import access.a.PublicClassInnerMain;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        /*
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
        다른 패키지 접근 불가능
         */
    }
}
