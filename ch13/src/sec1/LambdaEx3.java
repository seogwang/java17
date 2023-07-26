package sec1;
// 2023.07.26(수) 1교시
//##람다식 Supplier

@FunctionalInterface
interface MyLambda3 { // 추상체
    String print();
}

public class LambdaEx3 {
    public static void main(String[] args) {
        MyLambda3 lam3 = () -> { // 구현체
            return "김기태";
        };
        System.out.println(lam3.print());
    }
}
