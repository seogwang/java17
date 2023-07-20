package sec2;

public class MultiEx2 {
    Multi2 m1 = new Multi2<String,Integer>(Student, 98);
    Multi2 m2 = new Multi2<String,Integer>(Student, 98);
    Multi2 m3 = new Multi2<String,Integer>(Student, 98);
    boolean res = m1.compare(m1, m2);
    System.out.println("비교결과 : "+res1);
    boolean res = m1.compare(m1, m3);
    System.out.println("비교결과 : "+res2);
}
