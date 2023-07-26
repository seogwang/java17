//2023.07.26(수) 4교시

//BufferedReader : 줄 단위로 불러올 경우 활용
package sec3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) throws IOException {
        // try ~ catch ~ 하든지, throw 하든지
        BufferedReader rd = new BufferedReader(
          new FileReader("out4.txt")
        );
          String data;
          while((data = rd.readLine()) != null){
            System.out.println(data);
        }
    }
}
