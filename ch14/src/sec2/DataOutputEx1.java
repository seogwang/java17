package sec2;
//2023.07.26(수) 4교시
//파일 생성 클래스 : File, Files(path), FileOutputStream
//DataOutputStream : 한글과 같은 캐릭터셋을 지정하여 출력할 수 있음. => 기본셋 : UTF-8
//Files를 쓰려면 반드시 path를 써야 한다. path 지정하는 것이 좋다.


import java.io.*;

public class DataOutputEx1 {
    public static void main(String[] args) {
        try{
            File file = new File("out7.txt");
            if (!file.exists()){
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos); // 또 이것만 쓰면 안 된다. FileOutputStream으로 받아 와야 한다.
            DataOutputStream dos = new DataOutputStream(bos); // 이것만 쓰면 안 된다. BufferOutputStream으로 받아야 한다.

            // dos.write("구예진 천재"); // 이러면 오류가 난다. 바이트가 아니여서.
            // dos.write("구예진 천재".getBytes()); // 이래도 오류 난다. UTF-8이라서
            dos.writeUTF("구예진 천재"); // 최종 받아온 dos에서 write를 한다.
            dos.close(); // 이렇게 생성하면 NULDLE 라고 맨 앞에 나오는데, 지우면 안 된다. 처음 시작점이라는 소리다.
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
