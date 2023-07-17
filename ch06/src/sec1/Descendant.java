package sec1;

public class Descendant extends Man{
    @Override
    public void method1() {
        System.out.println("후손 메소드1");
    }

    @Override
    public int method2() {

    }

    @Override
    public int method2() {
        return 3;
    }
}
