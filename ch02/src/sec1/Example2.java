package sec1;

public class Example2 {
    public static void main(String[] args) {
        //대입연산 : =, +=, -=, *=, /=
        int su = 0, su2 = 0;
        su+=10; // su=su+10
        System.out.println("su+=10 => "+su);
        su-=5; // su=su-5
        System.out.println("su-=5 => "+su);
        su*=10; // su=su*10
        System.out.println("su*= => "+su);
        float num = 0.0f;
        su2 = su;
        su/=4; //su=su/4
        /* 중요 : 정수 나누기 정수의 결과는 정수로 자동 형변환됨. */
        num = su2 / 4.0f; //


        //증감연산 : +, -- 등의 전위와 후위가 존재
        int a = 10, b = 10;
        System.out.printf("a++의 결과 : %d\n", a++); // 후위 연산 : a를 먼저 출력하고, 연산한다. 결과 : 10
        System.out.println("나중 출력1 :"+a);
        System.out.printf("++b의 경과 : %d\n", ++b); // 전위 연산 : 연산을 먼저 하고, b를 출력한다. 결과 : 11
        System.out.println("나중 출력2 :"+b);
        System.out.printf("b-- 의 결과 : %d\n", b--); // 후위 연산
        System.out.println("나중 출력3 : "+b);
        System.out.printf("--a 의 결과 : %d\n", --a); // 전위 연산
        System.out.println("나중 출력4 : "+a);
    }
}
