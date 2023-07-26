package sec1;
//2023.07.26(수) 2교시
//##Stream

// Stream(스트림) : 바이트열 단위로 입력하거나 출력하는 클래스 -> 스트림 클래스
// 한글은 1글자당 요즘 4Byte가 추세다. UTF-8 캐릭터 셋 또는 인코딩 방식이라고 한다.
// Input 또는 Output 실행 후에 .close(); 해줘야 메모리에서 비워진다. 안 비우면 오류.
// 교재 713페이지


// 파일 생성, 삭제, 수정, 읽기, 출력 등이 가능해야 한다.


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx1 {
    public static void main(String[] args) {
        //Input -> 파일에 있는 자료를 가져오기 - InputStream
        //FileInputStream, ByteArrayInputStream, FilterInputStream
        //Output -> 자료를 파일에 저장하기 -> OutputStream
        //FilOutputStream, ByteArrayOutStream, FilterOutputStream
        //byte[] bArr = new byte[100];
        //파일 처리는 반드시 try ~ catch ~
        try {
            FileOutputStream fos = new FileOutputStream("out1.txt");
                              // fos.write("김기태"); // 이렇게 하면 입력이 안된다. 왜? 바이트열 단위로 입력하는 클래스이기 때문이다.
            fos.write(65); // try ~ catch ~ 를 해야 들어간다.
            fos.write(66);
            fos.write(67);
            fos.write(115);
            fos.write(127); // 키캡문자
            fos.write(65);
            fos.write(69);
            fos.close();    // close를 해줘야 메모리에서 비워진다.
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("출력 파일이 존재하지 않거나 경로가 틀렸습니다.");
        }

        try {
            FileInputStream fis = new FileInputStream("out1.txt");
            int i;
            while((i= fis.read()) != -1){
                System.out.print((char) i);
            } // for 문을 사용하지 않는다.
            fis.close(); // close를 해줘야 메모리에서 비워진다.
            System.out.println((char) fis.read()); // 불러올 때, 바이트 단위로 불러온다. 그래서 숫자로 온다.
            // 그래서 숫자를 문자로 바꿔줘야 한다. (char) : 캐팅 해준다.
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("입력 파일이 존재하지 않거나 경로가 틀렸습니다.");
        }
    }
}
