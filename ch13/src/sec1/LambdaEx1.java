package sec1;
// 2023.07.25(화) 4교시, 26(수) 1교시
//##람다식
// 기술만 해놓고 언제든지 원하는 곳에서 변경해서 써먹을 수 있다.
// 질문 : 간단한 식을 통해 코딩을 간소화 할 수 있나?

//@ 애너테이션 -> 컴파일러에게 이것이 뭐라고 미리 알려주는 것.
// 안해주면 에러를 일으킬 수 있다.
// 람다의 추상체는 기능적 인터페이스로 람다를 구현하려면, 이와 같은 추상체가 필요

@FunctionalInterface
interface MyLambda1 { // 추상체
    void print();
}

public class LambdaEx1 {
    public int method1(int x, int y){   //int : 반환타입
        return x*y;
    }
    /*
    람다식 구현체
    (argument)  (arrow token)   (function body) ;
      매개변수      애로우토큰       함수바디
      (x, y)          ->           {x*y};   * 세미콜론 반드시 넣어줘야 한다.
    () -> { };      : Basic
    (x) -> { };     : consumer
    () -> { x };    : Supplier
    (x) -> { x*x };  : Operator(운영자) : 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입  //  일반적
    Function(기능) : 매개변수를 받아 처리한 후 그 결과를 형변환하여 반환하는 타입(대체로)
    Predicate() : 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환하는 타입.
    */

    public static void method1(){
        System.out.println("안녕하세요~! 메소드1입니다.");
    }

    public static void main(String[] args) {
        method1();
        MyLambda1 lam1 = () -> {
            System.out.println("안녕하세요~! 람다식1입니다.");
        };
        lam1.print();
    }
}
