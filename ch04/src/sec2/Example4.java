package sec2;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        String code = "801225-1278000";
        char m = code.charAt(7); // 특정 인덱스에 있는 문자 반환
        String gender = (m=='1' || m=='3') ? "남" : "여" ;

        String yy = code.substring(0,2); // 특정 번째부터(begin index) 특정 번째(end index) 전까지 추출
        String mm = code.substring(2,4); // end index는 포함이 안 된다.
        String dd = code.substring(4,6);
        System.out.println("성별코드 : "+m);
        System.out.println("성별 : "+gender);
        System.out.println("생년월일 : "+(yy+"-"+mm+"-"+dd));
        //80-12-25

        String nick = "kimKiTae";
        int idx = nick.indexOf('g'); // 해당 문자의 인덱스를 반환
        System.out.println("g의 문자 인덱스 값 : "+idx); // 못찾으면 -1이 나온다.
        idx = nick.indexOf('i');
        System.out.println("i의 문자 인덱스 값 : "+idx);
        idx = nick.lastIndexOf('i');
        System.out.println("i의 마지막 찾은 경우의 인덱스 값 : "+idx);

        String name1 = nick + "imperial"; //문자열 결합 연산
        String name2 = nick.concat("imperial"); // 문자열 결합 연산

        //문자열을 문자배열로 : toCharAttay()
        //문자열을 바이트배열로 : getBytes();
        char[] nArr = nick.toCharArray(); // 문자열을 -> 문자배열 s e o g w a n g
        byte[] bArr = nick.getBytes(); //

        System.out.println("@ 3번째 : "+nArr[2]); // m
        System.out.println("# 3번째 : "+bArr[2]); // 109 -> m의 아스키 코드값

        int age = 43;
        float ht = 173.8f;
        boolean ps = true;

        // 특정 타입의 데이터를 문자열로 변환 => valueOf()
        String val1 = String.valueOf(age); // 정수 -> 문자열로 변환
        String val2 = String.valueOf(ht); // 실수 -> 문자열로 변환
        String val3 = String.valueOf(ps); // 부울 -> 문자열로 변환

        if(val1.equals("43")) System.out.println("문자열 변환 성공");

        //대문자로(toUpperCase())/ 소문자로(toLowerCase())
        System.out.println("대문자로 변환 : "+nick.toUpperCase());
        System.out.println("소문자로 변환 : "+nick.toLowerCase());

        //해당 특정 문자를 찾아 바꾸기 => replace(찾는문자,바꿀문자)
        String nick2 = nick.replace('K', 'g');
        System.out.println("바뀐 값 :"+nick2);

        String chunjae1 = "오세훈/오태훈/이은영/서광/이소윤/신예은";
        String chunjae2 = "백준철-신승원/구예진-한선/박진관-박나연";

        //문자열배열을 특정 구분자로 요소 분리 => split
        String[] stArr1 = chunjae1.split("/");
        String[] stArr2 = chunjae2.split("/|-"); //regex

        //문자배열을 출력 => Arrays.toString(문자열배열)
        System.out.println(Arrays.toString(stArr1));
        System.out.println(Arrays.toString(stArr2));

        String data1 = "      kim      ";
        String data2 = "tae       ";
        String data3 = "       gi";

        System.out.println("글자수1 : "+data1.length());
        System.out.println("글자수2 : "+data2.length());
        System.out.println("글자수3 : "+data3.length());

        //해당 문자열의 앞 뒤의 공백제거 -> trim()
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();

        System.out.println("글자수 1 : "+trans1.length());
        System.out.println("글자수 2 : "+trans2.length());
        System.out.println("글자수 3 : "+trans3.length());
    }
}
