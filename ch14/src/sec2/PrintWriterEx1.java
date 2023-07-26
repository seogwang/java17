package sec2;
//2023.07.26(수) 3교시
//##PrintWriter

// 출력을 버퍼, 한 줄, 한 글자, 문자열 등의 모든 단위의 파일에 쓰기 작업이 가능하다.

// println, print 이걸 내 마음대로 쓰고 싶을 때

import java.io.*;

public class PrintWriterEx1 {
    public static void main(String[] args) {
        try {
            File file = new File("out4.txt");  // 파일 객체 만듦.
            if(!file.exists()){                   // 파일이 존재하는 지 확인 없으면 생성.
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file); // 파일 쓸 때 필기도구 (연필)
            // 이제 버퍼에 있는 내용을 쓰면 된다.
            PrintWriter writer = new PrintWriter(fw); // 정말 필기를 잘하는 사람

            //연필로 노트에 쓰기

            writer.write("점심시간 10분전");
            writer.print("배고파");
            writer.println("밥");
            writer.print("\n진짜 배고파");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
