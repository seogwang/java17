package sec1;

public class Student {
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;


    //접근제한자 반한타입 메서드명([타입 매개변수]) {return 해당반환타입의 데이터 값}

    //1. 리턴X, 매개변수X
    public void method1() {
        System.out.println("메서드1");
    }

    //2. 리턴O, 매개변수X
    public int method2(int a) {
        return a;
    }

    //3. 리턴X, 매개변수O
    public void method3(int b){
        System.out.println("당신은 "+b);
    }

    //4. 리턴O, 매개변수O
   // public int method4(int c){
        //int
   // }
}
