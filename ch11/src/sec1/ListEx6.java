package sec1;

import java.util.LinkedList;
import java.util.List;

public class ListEx6 {
    public static void main(String[] args) {
        List<Student> s = new LinkedList<>();

        s.add(new Student(1,"백준철",10));
        s.add(new Student(2,"박진원",9));
        s.add(new Student(3,"오세훈",8));
        s.add(new Student(4,"신승원",8));

        for(int i=0;i<s.size();i++){
            Student a = s.get(i);
            System.out.println(a.sno+"\t"+a.sname+"\t"+a.point);
        }
        //일반적인 속도는 LinkedList가 이전포인터와 다음포인터가 있어 훨씬 빠르나
        //중간 삭제나 중간 삽입의 경우는 List가 더 빠르다.
    }
}
