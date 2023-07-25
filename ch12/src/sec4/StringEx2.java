package sec4;
//2023.07.25(화) 2교시
//##문자열 분리 : .split("기준기호")

// 데이터가 어떻게 들어올지 모르니, 세 가지 방법을 다 알고 있어야 한다.
// 먼저, 스트링 배열을 변수 지정 하고, 받을 문자열 변수명.split("분리문자");
// 1 : .split("분리 문자");
// 2 : .split("분리문자1|분리문자2|분리문자3");
// 3 : StringTokenizer로 객체 생성 후 반복문으로 출력
// StringTokenizer 변수명 = new StringTokenizer(mem3, "/");

import java.util.StringTokenizer;

public class StringEx2 {
    public static void main(String[] args) {
        String mem1 = "이슬비/박나연/최상민/황교진/김이호";
        String[] m1 = mem1.split("/");      // 기호를 기준으로 나눠서 배열에 저장한다.
        System.out.println("팀0");
        for(String name:m1){
            System.out.println(name);
        }

        System.out.println("\n팀1");
        String mem2 = "신승원&오세훈,백준철,구예진-김기태";
        String[] m2 = mem2.split("&|,|-");      // 기호를 기준으로 나눠서 배열에 저장한다.
        for(String name:m2){
            System.out.println(name);
        }

        System.out.println("\n팀2");
        String mem3 = "오태훈/신예은/박진관/김현경/김보경";
        StringTokenizer em3 = new StringTokenizer(mem3, "/");
        int cnt = em3.countTokens();        // 토큰에 의해 분리된 요소 수
        for(int i=0;i<cnt;i++){
            String token = em3.nextToken();
            System.out.println(token);
        }
    }
}
