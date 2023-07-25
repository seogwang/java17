package sec3;

public class SystemEx1 {
    public static void main(String[] args) {
        for(int i=0; i<5;i++){
            try {
                //비밀번호 확인 로직
                System.out.println(i);
            } catch (SecurityException e) {
                System.exit(i);
                System.out.println("종료");
            }
        }
    }
}
