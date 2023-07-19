package sec1;

public class Example6 {
    public static void main(String[] args) {
        //class loading 구문에는 반드시 try~catch~ 처리 필수!!!
        try {
            Class clazz = Class.forName("maria.jdbc.driver");
        } catch (ClassNotFoundException e) {
            System.out.println("존재하지 않는 클래스이거나 알 수 없는 클래스임");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("원인 불명");
            e.printStackTrace();
        } finally{
            System.out.println("연결 종료 / 자동 닫기");
        }
    }
}
