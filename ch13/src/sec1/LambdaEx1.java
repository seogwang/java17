package sec1;
// 2023.07.25(화) 4교시
//##람다식

public class LambdaEx1 {
    public int method1(int x, int y){   //int : 반환타입
        return x*y;
    }
    /*
    람다식 구현체
    (x, y) -> { x*y };  // 소괄호 블럭 : 매개변수, { } : 리턴.
    () -> { };      : Basic
    (x) -> { };     : consumer
    () -> { x };    : Supplier
    (x) -> { x*x };  : Operator(운영자) : 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입  //  일반적
    Function(기능) : 매개변수를 받아 처리한 후 그 결과를 형변환하여 반환하는 타입(대체로)
    Predicate() : 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환하는 타입.
    */
}
