package sec1;

public class Example5 {
    static class Animal { }
    static class Tiger extends Animal { }
    static class Lion extends Animal { }
    public static void main(String[] args) {
        Animal ani;
        ani = new Tiger();
        ani = new Lion();

        Tiger tiger;
        tiger = new Tiger();
        // tiger = new Lion(); // 이건 안 된다.
        changeObject1(tiger);

        Lion lion;
        lion = new Lion();
        changeObject2(lion);
    }
    private static void changeObject1(Animal a){
        try {
                Lion l = (Lion) a;
        } catch(ClassCastException e){
            System.out.println("형제나 다른 패키지에 있는 클래스의 객체로 형 변환 할 수 없음");
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void changeObject2(Animal a){
        try {
            Tiger t = (Tiger) a;
        } catch(ClassCastException e){
            System.out.println("형제나 다른 패키지에 있는 클래스의 객체로 형 변환 할 수 없음");
            System.out.println(e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
