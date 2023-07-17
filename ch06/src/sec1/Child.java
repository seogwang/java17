package sec1;

public class Child extends Man {
    //추상화된 클래스를 상속받아 구현하는 경우 추상메소드를 모두 구현내용을 기술할 수
    //있도록 오버라이딩을 해야한다.
    @Override
    public void method1() {
        System.out.println("메소드1");
    }


}
