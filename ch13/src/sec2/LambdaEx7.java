package sec2;
// 2023.07.26(수) 2교시
//##람다식 Predicate

// 람다식에 어떤 값이 들어올 지 모르니, 제네릭을 쓴다.
// 제네릭의 정점 : 컬렉션 프레임 워크 이다.

@FunctionalInterface
interface MyLambda7<T, Q> {
    boolean compare(T t, Q q);
}

public class LambdaEx7 {
    public static void main(String[] args) {
        MyLambda7<Integer, Integer> comp1 = (a, b) -> {     // 숫자 비교 후 boolean 값
            return (a==b ? true : false);
        };
        MyLambda7<String, String> comp2 = (a, b) -> {       // 문자열 비교 후 boolean 값
            return (a.equals(b) ? true : false);
        };
        System.out.println("비교 결과 : "+comp1.compare(10, 30));
        System.out.println("비교 결과 : "+comp2.compare("김기태", "김기태"));
    }
}
