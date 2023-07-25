package sec3;
// 2023.07.25(화) 1교시


class Student{
    public int no;
    public String name;
    public Student() { }
    public Student(int no, String name) { this.no = no; this.name = name; }
}
public class SystemEx2 {
    public static void main(String[] args) {
        Student st1;
        st1 = new Student(1, "김예은"); // 가비지1 들어올 때부터 쓰레기 값이다.
        st1 = null; // 객체는 null 값을 가질 수 있다.
        st1 = new Student(); // st1은 가비지2 값을 가지고 있다.
        System.out.println(st1.no+"\t"+st1.name);
        // 사용하지 않는 쓰레기 모으기, 메모리 부족 해결을 위해
        System.gc(); // 가비지 콜렉션(Garbage Collection) : 더 이상 사용하지 않는 메모리 공간을 모아서 사용 가능한 공간으로 변경.

    }
}
