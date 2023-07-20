package sec2;

public class Run2 {
    public static void main(String[] args) {
        //쓰레드 정보 출력
        Thread curT = Thread.currentThread(); // 현재 실행 중인 쓰레드의 객체

        System.out.println("현재 동작 중인 쓰레드 이름 : "+curT.getName());
        System.out.println("현재 동작 중인 쓰레드 개수 : "+curT.activeCount());


    }
}
