package sec1;
// 2023.07.26(수) 1교시
//##람다식 consumer

// 다른 클래스에서 만든 람다식 사용하는 방법
// 단점 : 하나의 메소드만 기술할 수 있다.

@FunctionalInterface
interface MyLambda2 {
    void print(int x);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyLambda1 lam1 = () -> {
            System.out.println("오늘 가산역 사고");
        };
        lam1.print();

        MyLambda2 lam2 = (x) -> {
            System.out.println("제곱 결과 : "+(x*x));
        };
        lam2.print(1004);
    }
}
