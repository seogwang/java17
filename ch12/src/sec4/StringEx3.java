package sec4;
//2023.07.25(화) 3교시
//##StringBuffer, StringBuilder(끼워넣기, 빼내기)
// java.lang에 다 있다.
// Builder에서 split 할 때는 형 변환을 해줘야 한다.
// split 메서드가 String에 속한 것이기 때문에 String과 StringBuffer는 다르다. 그래서 형변환 해주는 것이다.
// String str = str3.toString(); // 스트링 빌더에서 형변환

// StringBuffer를 통해서 append 해서 추가 할 수 있다.
// 거꾸로 출력 : .reverse
// 스트링 분리 : .split
// 문자 꺼내오기 : 스트링명.substring(시작번째,끝번째)

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str1 = new String();
        str1+="서광";
        str1+="/";
        str1+="이은영";
        str1+="/";
        str1+="한선";
        str1+="/";
        str1+="이소윤";
        System.out.println(str1);

        // 똑같이 추가하는 것인데, 연산자를 사용하지 않고 메서드를 사용해서 추가한다.
        // 좋은 점은 나중에 제거할 때 용이하다.
        StringBuffer str2 = new StringBuffer();
        str2.append("신승원");
        str2.append("/");
        str2.append("오세훈");
        str2.append("/");
        str2.append("구예진");
        str2.append("/");
        str2.append("백준철");
        str2.append("/");
        System.out.println(str2);

        //replace가 가능할까? 가능하다.
        str2.replace(0,3,"김기태");
        System.out.println(str2);
        System.out.println(str2.toString());


        StringBuilder str3 = new StringBuilder();   // StringBuilder 사용
        str3.append("황교진");
        str3.append("-");
        str3.append("이슬비");
        str3.append("-");
        str3.append("최상민");
        str3.append("-");
        str3.append("김이호");
        System.out.println(str3);
        System.out.println(str3.toString()); // 데이터가 잘 안나오면 toString()을 넣는다.

        //인덱스가 4인 곳에 끼워 넣고 싶어! 문자를 중간에 끼워 넣고 싶을 때는 StringBuilder를 쓴다.
        str3.insert(4, "박나연-");
        System.out.println(str3.toString());
        System.out.println(str3.substring(4,7)); // 앞 숫자 부터 뒷 숫자 인덱스까지 꺼내온다.
        System.out.println(str3.reverse()); // 거꾸로 출력
        // length도 된다.
        // 분리
        String str = str3.toString(); // 스트링 빌더에서 형변환
        String[] str4 = str.split("-"); // 오류가 뜬다. String과 StringBuilder의 형이 다르기 때문에 형변환 해줘야 한다.
        System.out.println(str4);   // 이렇게 하면 주소가 뜬다.
        System.out.println(Arrays.toString(str4));  // 이렇게 해야 내용이 뜬다.

    }
}
