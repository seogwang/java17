package sec2;

public class Example6 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0b100; // 2진수. binary. cpu에서 연산할 때 2진수, 컴파일도 2진수. 기계어.
        int c = 0100; // 0으로 시작하면 8진수. octal. 권한 부여 및 수행. 회수.
        int d = 0x100; // 16진수. C언어에서는 0h를 썼었다. hex 헥시멀. 10 진수 + 헥사 16진수. hex의 x를 쓴다. 실제 물리적 주소 또는 메모리 주소
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
