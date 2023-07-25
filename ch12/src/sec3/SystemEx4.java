package sec3;
// 2023.07.25(화) 1교시

// System 관련 정보 출력
// 출력할 때도 System을 쓴다.
// 운영체제 : 사용자가 하드웨어를 사용할 수 있게끔, 사용자로부터 입력받은 것들을 시스템에 일을 시킨다.
// SE (System Engineer)
// 환경변수 : env

import java.util.Properties;
import java.util.Set;

public class SystemEx4 {
    public static void main(String[] args) {
        System.out.println("운영체제 : "+System.getProperty("os.name"));    // 운영체제 이름 알려줘!
        System.out.println("사용자 : "+System.getProperty("user.name"));   // 사용자 이름 알려줘!
        System.out.println("사용자 디렉토리 : "+System.getProperty("user.home"));  //
        System.out.println("자바 버전 : "+System.getProperty("java.version"));     // 자바 버전 알려줘!
        System.out.println("자바 홈 : "+System.getProperty("java.home"));  //

        Properties props = System.getProperties();  // props라는 객체에 System클래스의 properties를 다 담는다.
        // 이것의 부모는 map이다. 키 값을 가져와야 한다. 키 값을 가져오기 위한 set을 만든다.
        Set keys = props.keySet(); // valueSet 하면 값을 가져오는 것이고, keySet 하면 키 값을 다 가져온다.
        for(Object obj : keys){    // 어떤 게 있는지 모르니까, 키값을 다 가져와서 만든 obj에서 가져오기 위해 for문, Object를 쓴다.
            String key = (String) obj;  // 받아온 값을 다 String으로 바꿔서 저장. 그래야 이 다음 getProperty 인수로 전달 할 수 있겠네!
            String val = System.getProperty(key);
            System.out.println("["+key+"]"+val);
        }
    }
}

// 어떤 데이터를 가져와서 활용하거나 출력할 때 map의 하위에 있는 set을 쓸 수 있네!
// set과 map의 차이가 뭐가 있었는데... 중복 허용 안 한다거나... 등.