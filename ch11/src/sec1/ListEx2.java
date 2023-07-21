package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
    public static void main(String[] args) {
        List lst1 = new ArrayList();
        lst1 = new Vector();
        lst1 = new LinkedList<>();

        ArrayList lst2 = new ArrayList();
//      lst2 = new Vector(); // 안 됨.

        method1(lst1);
        method2(lst2);
    }
    public static void method1(List ls) { } // method1은 쓸모가 많다.
    // ArrayList,Vector, LinkedList 등을 다 받을 수 있다. 인터페이스라서.
    public static void method2(ArrayList ls) { }

}
