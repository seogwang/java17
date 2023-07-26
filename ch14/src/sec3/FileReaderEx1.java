package sec3;
//2023.07.26(수) 4교시
//##FileReader
//파일을 읽어오는 방법 : FileReader, BufferedReader, Scanner, Files

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException, Exception{
        try {
            FileReader fr = new FileReader("out3.txt");
            // 파일을 읽어와야 한다.
            int rd;
            while((rd=fr.read()) != -1){
                System.out.print((char)rd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
