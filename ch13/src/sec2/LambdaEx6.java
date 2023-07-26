package sec2;
// 2023.07.26(수) 1교시
//##람다식 계산기

//매개변수에 뭐가 들어올지 몰라 : 제네릭 사용한다.  : <T>

@FunctionalInterface
interface MyLambda6<T, Q> {
    Q calc(T x, T y);
}

public class LambdaEx6 {
    public static void main(String[] args) {
        //더하기/빼기/곱하기/나누기
        MyLambda6<Integer, Double> plus = (x, y) -> {
            return (double) x+y;
        };
        MyLambda6<Integer, Double> minus = (x, y) -> {
            return (double) x-y;
        };
        MyLambda6<Integer, Long> mul = (x, y) -> {
            return (long) x*y;
        };
        MyLambda6<Integer, Double> div = (x, y) -> {
            return (double) x/y;
        };
        MyLambda6<Integer, Integer> mod = (x, y) -> {
            return x%y;
        };

        System.out.println("더한 결과 : "+plus.calc(30,60));
        System.out.println("뺀 결과:"+minus.calc(90,27));
        System.out.println("곱한 결과:"+mul.calc(90,27));
        System.out.println("나눈 결과:"+div.calc(90,27));
        System.out.println("나눈 나머지:"+mod.calc(90,27));
    }

}
