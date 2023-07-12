package sec1;

public class Example1 {
    public static void main(String[] args) {
        int[] a; // 선언1 - 타입[] 배열명;
        int b[]; // 선언2 - 타입 배열명[];

        int[] c = new int[3];
        int d;
         //a는 선언만 된 상태이며, 메모리 할당이 되지 않았기 때문에
        // System.out.println("a[0]="+a[0]);
        // System.out.println("b[0]="+b[0]);
        System.out.println("c[0]="+c[0]);
        // d는 primitive 타입이므로 반드시 초기화가 필요함.
        // System.out.println("d="+d);


    }
}
