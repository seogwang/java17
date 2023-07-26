package sec2;
//2023.07.26(수) 3교시
//##BufferWriter에 데이터를 집어 넣고 쓴다.

//출력 방식 : OutputStream도 있지만, BufferWriter, PrintWrite, FileOutput, Files, DataOutputStream

//파일 가져오기

//BufferWriter를 쓰면 좋지만, 신호를 보낼 때는 Stream으로 보낸다.
// Ex) 채팅창. 한 땀 한 땀 보내야 한다.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx1 {
    public static void main(String[] args) {
        /*
        String path = "c:\\Users\\db400tea\\IdeaProjects\\ch14\\out3.txt";
        File file = new File(path);
         */
        try {
            File file = new File("out3.txt"); // 노트

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file); // 파일 쓸 때 필기도구 (연필)
            // 이제 버퍼에 있는 내용을 쓰면 된다.
            BufferedWriter writer = new BufferedWriter(fw); // 연필 사용자가 준비 됐다.
            
            //연필로 노트에 쓰기

            writer.write("점심시간 10분전");  // 이것은 바이트 단위가 아니다. 스트링 단위다.
            writer.close(); // 반드시 닫아줘야 한다. 파일 객체는 알아서 닫힌다.
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
