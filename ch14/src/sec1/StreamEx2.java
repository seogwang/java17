package sec1;
//2023.07.26(수) 3교시
//##Stream 과제

//키보드로 문자를 입력받아 out2.txt로 저장하고,
//그 내용을 불러와 콘솔창에 다시 출력하는 프로그램
//스캐너 이용.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte ipruck = in.nextByte();
        // 문자 혹은 문자 열을 입력 받아서, 문자들을 컬렉션 프레임 워크에 배열로 집어 넣고,
        // 그 넣은 것들을 하나씩 꺼내서 Byte 형으로 바꿔 준 다음에 입력 해야 되나?
        // 입력할 때도 반복문 써서?

        try {
            FileOutputStream fos = new FileOutputStream("out2.txt");
            fos.write(ipruck);
            fos.close();    // close를 해줘야 메모리에서 비워진다.
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("출력 파일이 존재하지 않거나 경로가 틀렸습니다.");
        }

        try {
            FileInputStream fis = new FileInputStream("out2.txt");
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
