package sec2;
//2023.07.26(수) 4교시


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out5.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("eat rice".getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("out5.txt");
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
