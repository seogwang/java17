package sec1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiEx2 {
    public static void main(String[] args) {
        /*
        java.util 패키지 : java.lang 패키지의 추가 기능파능로 대부분 import가 필요한
        클래스로 구성된다. */
        //Arrays : 배열을 효율적으로 다루기 위한 클래스
        //Calender : 날짜(달력)와 관련된 데이터를 다루기 위한 클래스 => 복수형
        //Date : 날짜와 관련된 데이터를 다루기 위한 클래스 => 단일형 하나의 날짜 객체를 만들어 준다.
        //Objects : 여러 객체를 한 번에 다루기 위한 클래스
        //StringTokenizer : 문자열 객체들을 다루기 위한 클래스
        //Random : 난수들을 다루기 위한 클래스
        //Collection : List, Set, Map, Stack, Queue, Deque...
        //...
        Date now = new Date();
        System.out.println(now);

        String strNow = now.toString(); //날짜를 String으로 변환
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//        String today1 = sdf.format(strNow); // 자바 version 8미만
        String today2 = sdf.format(now); // 자바 version 8이상
//        System.out.println("문자열에 표시형식 날짜로 표시 : "+today1);
        System.out.println("날짜에 표시형식 날짜로 표시 : "+today2);

        /* 비추...*/
        int y = now.getYear() + 1900;
        int M = now.getMonth() + 1;
        int d = now.getDate();
        int w = now.getDay(); // 요일이 나온다.
        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();
        System.out.println(y+"년 "+M+"월 "+d+"일");
        System.out.println(h+"시 "+m+"분 "+s+"초");
        //Calendar cal = new Calendar(); // 1.7에서 이렇게 한다.
//      int yy = now.get(Calendar.YEAR); // 자바8 이상은 Calendar가 추상체와 정적 구조로 구성되어 있으므로
//      별도의 객체를 생성하지 않는다. 안 된다. 바꼈다. util 패키지는 자주 바뀌기 때문에 해보면서 확인.
        Calendar n = Calendar.getInstance();

        // 자바8 이상은 LocaleDate를 활용하여 시간대나 지역의 지역성을 나타냄

    }
}
