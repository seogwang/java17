package sec5;
//2023.07.25(화) 4교시
//## Pattern : 형식 검증시 사용한다. 전화번호, 이메일, 비밀번호 등.

import java.util.regex.Pattern;

// Pattern.matches(검증식, 검증 문자열);

// 검증 : pattern 클래스.
// 먼저 검증식을 만들어 준다.
//regist Expression : 등록시 갖추어야할 데이터의 검증식
//(), []: 그룹핑, w : 단어, d : 십진수(정수), {글자수}, {최소글자수,최대글자수}
//^ : 시작 문자(접두사), $ : 끝 문자(접미사)

public class PatternEx1 {
    public static void main(String[] args) {
        //regist Expression : 등록시 갖추어야할 데이터의 검증식
        //(), [엉문 대소문자, 숫자]: 그룹핑, w : 단어, d : 십진수(정수), {글자수}, {최소글자수,최대글자수}
        //^ : 시작 문자(접두사), $ : 끝 문자(접미사)
        //? : 유 또는 무, 있거나 없거나 관계 없다., * : 유/무/하나이상, + : 무조건 하나이상

        String regExp = "(02|031|010)-\\d{3,4}-\\d{4}"; // 검증식. \d는 이스케이프 문자다. \\두개 써줘야 한다.
        String tel1 = "(02)-1004-1234";
        String tel2 = "02-1004-1234";
        String tel3 = "010-1004-1234";
        String tel4 = "(010)-1004-1234";
        String tel5 = "(031)1231004";
        String tel6 = "0311231004";
        String tel7 = "031-123-1004";

        //전화번호 검증
        System.out.println("형식 검증1 : "+ Pattern.matches(regExp, tel1));
        System.out.println("형식 검증2 : "+ Pattern.matches(regExp, tel2));
        System.out.println("형식 검증3 : "+ Pattern.matches(regExp, tel3));
        System.out.println("형식 검증4 : "+ Pattern.matches(regExp, tel4));
        System.out.println("형식 검증5 : "+ Pattern.matches(regExp, tel5));
        System.out.println("형식 검증6 : "+ Pattern.matches(regExp, tel6));
        System.out.println("형식 검증7 : "+ Pattern.matches(regExp, tel7));

        
        //[0-9a-zA-Z] : 영문대소문자숫자 입력가능
        //[가-힣] : 한글만 입력 가능
        regExp = "\\w+@\\w+(\\.\\w+)?";
        regExp = "\\w+@\\w+.\\w*.[a-z]{2,3}$";
        String email1 = "kkt@gmail.com";
        String email2 = "kkt.naver.com";
        String email3 = "chunjae@nate.co.kr";
        String email4 = "chunjae.hotmail.com";
        String email5 = "chunjae@hotmail.ne.kr";

        System.out.println();
        //이메일 검증
        System.out.println("이메일 검증 1 : "+Pattern.matches(regExp, email1));
        System.out.println("이메일 검증 2 : "+Pattern.matches(regExp, email2));
        System.out.println("이메일 검증 3 : "+Pattern.matches(regExp, email3));
        System.out.println("이메일 검증 4 : "+Pattern.matches(regExp, email4));
        System.out.println("이메일 검증 5 : "+Pattern.matches(regExp, email5));
    }
}
