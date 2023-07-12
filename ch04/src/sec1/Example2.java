package sec1;

public class Example2 {
    public static void main(String[] args) {
        int[] a ={90, 75, 80, 85};
        int b[] = {85, 100, 70, 90};
        int[] c = new int[4];
        c[0] = 100;
        c[1] = 100;
        c[2] = 100;
        c[3] = 100;
        // c[4] = 100;

        int[] d;
        d = new int[]{90, 80, 85, 60}; // 할당과 초기화
        //추가 할당시에는 오류가 없으나 실제 할당이 되지 못해서 출력할 수 없음.
        //d[4] : 100;

        for(int i=0;i<a.length;i++){
            System.out.println("a의"+i+"번째 데이터 : "+a[i]);
        }
        for(int i=0;i<b.length;i++){
            System.out.println("b의"+i+"번째 데이터 : "+b[i]);
        }

        for(int p:c) { //p=c[0], p=c[1],
            System.out.println(p);
        }

        for(int i=0;i<c.length;i++){
            System.out.println("c의"+i+"번째 데이터 : "+c[i]);
        }
    }
}
