package sec2;
//2023.07.26(수) 4교시
//#Files
// Files 클래스의 write() 메소드는 static이므로 별도의 파일 객체를 만들지 않는다.
// 객체를 따로 만들지 않아도 된다.

// java.nio.file
// 네트워크 io 라는 뜻이다. 네트워크에서 파일을 주고 받을 때, 파일

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class FilesEx1 {
    public static void main(String[] args) {
        try {
            Path pat = Paths.get("C:\\Users\\db400tea\\IdeaProjects\\ch14\\out6.txt");
            // Paths는 path 안의 내부 클래스이다.
            Files.write(pat, "I\'m dying of hunger".getBytes()); // .getBytes() : 스트링을 바이트 배열로 바꿀 때 쓴다.
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
