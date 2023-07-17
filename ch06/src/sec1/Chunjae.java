package sec1;
class Chanwon {
    private int seq;
    private int data;

    public Chanwon() {
        this(1);
    }
//    public Chanwon( {
//        this(int seq, 100);
//    }
    public Chanwon(int seq, int data) {
        this.seq = seq;
        this.data = data;
    }
}

public class Chunjae {
    //멤버 필드 = 변수, 상수
    private  int no;
    protected int point;
    int partNo;
    public String name;
    public final static double PI = 3.141592; // 상수

    public void getValue(int no){ // private 멤버는 클래스 내부에서만 this
        this.no = no;
    }
}
