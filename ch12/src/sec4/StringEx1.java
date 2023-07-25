package sec4;
//2023.07.25(화) 2교시
//##String

// .charAt(n); : n번째 인덱스 글자 출력
// 객체명.equals(객체명); : 값 비교.
// 문자열.getBytes() : 해당 객체를 바이트 값으로 가져온다. -> 이거 사용시에는 담을 배열을 꼭 선언해준다.

// 배열은 배열명(변수명)을 그대로 출력하면 주소가 출력된다.


import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String str1 = new String("KimGiTae"); // String 클래스에 의해 str1 객체 생성
        String str2 = "kimkitae";
        System.out.println("name : "+str1);        // 김기태에서 4번째 글자 출력하고 싶을 때. charAt을 쓴다.
        System.out.println("네 번째 글자 : "+str1.charAt(3));
        System.out.println("문자열 비교 : "+str1.equals(str2)); // str1과 str2를 비교한다.

        byte[] bArr = str1.getBytes();  // 문자열을 바이트 배열로 분리 : 먼저,바이트 배열을 선언해줘야 한다. 분리한 그 값을 저장할 장소가 필요하니까! 변수의 특징!
        System.out.println("byte[]의 출력 : ");
        System.out.println(bArr);   // 출력하려면 반복실행문을 실행해야 한다. 그게 아니라 배열 이름을 인수로 넣어 출력하면 주소값이 나온다.
        // 두 가지 방법이 있다.
        // 첫 번째 : 함수를 만든다. 별도의 메소드를 호출하여 반복문으로 출력
        printArr(bArr); // 임의의 printArr이라는 이름의 함수를 만듦.
        // 두 번째 : Arrays.toString(배열명);을 쓴다.
        char[] cArr = new char[bArr.length]; // 여기 왜 이렇게 선언한거지? bArr의 길이만큼의 크기 배열cArr을 생성.
        for(int i=0; i<bArr.length;i++){
            cArr[i] = (char) bArr[i];
        }
        //System.out.println(Arrays.toString(bArr)); // 이것만 쓰면 숫자만 나온다. 그래서 이것도 char로 바꿔줘야 한다.
        // 위의 for 문이 char로 바꿔주는 로직.
        System.out.println(Arrays.toString(cArr));

        //해당하는 문자열의 인덱스 구하는 것 : .indexOf("") // 쌍 따옴표 안에 문자를 넣는다.
        System.out.println("i는 몇 번째? "+(str1.indexOf("i"))); // 특정 문자의 인덱스. 단어도 된다.
        
        //가장 많이 쓰는 것 .substring(시작번째, 끝번째)!!

        System.out.println("인덱스가 3부터 6전까지 : "+(str1.substring(3,6)));

        //대, 소문자로 바꾸기 : .toLowerCase(), .toUpperCase()

        System.out.println("소문자로 : "+str1.toLowerCase());
        System.out.println("대문자로 : "+str1.toUpperCase());

        // 찾아 바꾸기 : .replace("타겟문자", "바꿀문자")
        String data1 = str1.replace("T", "W"); // 문자 써줄 때는 "" (쌍 따옴표 안에 쓴다)
        System.out.println("T를 W로 변경 : "+data1);

        // 글자수 출력 : .length()
        String str3 = "        My name is GiTae, Kim        ";
        System.out.println("str3의 글자수 : "+(str3.length()));

        // 공백 제거 : .trim()
        System.out.println("공백 제거 전 : "+str3);
        System.out.println("공백 제거 후 : "+str3.trim());

        // 자바는 메서드 체인이 가능하다. 메서드 체인 : 두개 연달아 쓰는 것?
        System.out.println("str3의 공백 제거 후 글자수 : "+(str3.trim().length()));


        int k = 1004;
        // String t = (String) k;   // k를 문자로 바꾸려고 시도, 안됨.
        String t1 = k + "";      // 숫자를 문자열로 => 비추천.
        String t2 = String.valueOf(k);    // 숫자를 문자열로 => 이 방법을 추천. 아마 DB나 다른 것들과 연동하면서 할 때 쓸 듯.
        System.out.println(t1);
        System.out.println(t2);
        // 해당 변수가 문자인지 여부 확인
        // System.out.println("k가 문자열? "+(k instanceof String)); // k가 String으로부터 만든 객체냐? 물어보는 것이다.
        // String 위치에 참조형 변수가 들어온다. 그래서 이것은 잘못 됐다. k가 참조형 변수로 만들어진 것이 아니기 때문에.
        System.out.println("t1이 문자열? "+(t1 instanceof String));
        System.out.println("t2이 문자열? "+(t2 instanceof String));



    }

    // psvm 밖에 메서드 만드네?
    static void printArr(byte[] arr){ // 인수를 byte[] 배열 타입의 arr로 받음.
        for(int i=0;i<arr.length;i++){ // arr의 크기만큼 반복문.
            char a = (char) arr[i]; // 바이트 배열 arr의 인덱스 0번부터 마지막까지 char형으로 변환 후 char 변수 a에 저장
            //System.out.println(arr[i]); // 이렇게만 찍으면 숫자만 나온다. 그래서 char로 강제 형변환 해줘야 한다.
            System.out.println(a);
        }
    }// 인수는 byte[] 배열로 한다. 보내주는 값이 바이트 배열이기 때문에

}
