package sec2;
//제너릭의 제한 -> <T extends 제한클래스>
//제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class MultiEx3 {
    public static void main(String[] args) {
//        Child<Parent> c1 = new Child<Parent>(); 오류
        Child<My> c1 = new Child<My>(); // java 1.7 이상에서는 new Child<My> 에서 My 생략 가능
        //자기 자신은 만들 수 없다.
        Child<Season> c3 = new Child<>(); 
}
