package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();

        //데이터 중복X, 순서유지X
        Set<String> set2 = new HashSet<>();
        set2.add("이은영");
        set2.add("최상민");
        set2.add("김이호");
        set2.add("이슬비");
        set2.add("김이호");
        set2.add("이은영");

        System.out.println("Set 결과");
        Iterator it = set2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //데이터 중복0, 순서유지0
        List<String> ls2 = new ArrayList<>();
        ls2.add("이은영");
        ls2.add("최상민");
        ls2.add("김이호");
        ls2.add("이슬비");
        ls2.add("김이호");
        ls2.add("이은영");
        System.out.println("\nList 결과");
        for(String d:ls2){
            System.out.println(d);
        }
    }
}
