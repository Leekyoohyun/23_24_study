package ArrayListStudy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    private int size = 0;   // 몇 개의 데이터가 위 ArrayList1에 들어가 있는지
    private Object[] elementData = new Object[100];
    // 100개의 데이터만을 수용할 수 있는 배열: elementData
    public boolean addLast(Object element){
        elementData[size] =element;
        size ++;
        return true;
    }



}

