package sec1;

public class Example4 {
    public static void main(String[] args) {
        // 32 16 8 4 2 1
        int a = 20; // 10100
        int b = 14; // 01110
        //비트연산 = 2진수
        System.out.println("a & b : "+(a&b)); // 00100 => 4
        System.out.println("a | b : "+(a|b)); // 11110 => 30
        System.out.println("~a : "+(~a)); // 101011 부호 비트를 생각해야 한다.
        System.out.println("a ^ b : "+(a^b)); // 11010 xor 입력이 서로 다를 때 1 나온다.
        System.out.println("a>>2 : "+(a>>2)); // 시프트 연산 이것은 나누기, 곱하기구나! 시프트 레지스터.
        System.out.println("a>>2 : "+(a<<2)); // 시프트 연산 이것은 나누기, 곱하기구나! 시프트 레지스터.
        System.out.println("a>>2 : "+(a>>>2)); // 시프트 연산 이것은 나누기, 곱하기구나! 시프트 레지스터.
        System.out.println("a>>2 : "+(a<<2)); // 세개 안 된다! 전자회로 전공, 전문가만 알면 된다. 세개와 두개의 차이.
    }
}
