package sec1;

public class Example1 {
    public static void main(String[] args) {
        //예외(Exception) : 문법 상의 오류(Syntax Error)가 아니며, 실행 중의 오류가 발생한 상황.
        //주요 예외 : NullPointer, Arithmetic, ArrayIndexBounds, ClassCast, NumberFormat
        //ClassNotFound
        //모든 예외는 java.lang.Exception 의 서브 클래스로 구성된다.
        //외부 자원(파일, 데이터베이스, 주변 장치) 등을 연동하거나 활용하기 위하여는 반드시
        //예외 처리가 동반되어야 함.
        int no1 = 100;
        int no2 = 0;
        int res = 0;

        try {
            res = no1 / no2;  //예외 처리 대책이 필요한 문장을 try구절로 묶는다.
        } catch (ArithmeticException e) { // 예외 사항이 발생하였을 경우 실행할 문장을 catch 구절로 묶는다.
            System.out.println("no2 가 0으로 나누려고 시도하였음");
            System.out.println(e.getMessage());
            e.printStackTrace(); // 일반적으로 이걸 쓴다.
        } catch(Exception e){
            e.printStackTrace();
        } finally { // 실패든 성공이든 관계없이 무조건 실행해야 하는 문장.
            System.out.println("연결 종료");
            System.out.println("닫기");
        }
        System.out.println("출력 완료");
    }
}
