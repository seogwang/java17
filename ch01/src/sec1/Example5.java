package sec1;

public class Example5 {
    public static void main(String[] args) {
        byte b1 = 104;
        // byte b2 = -129; 해당 표현범위보다 작음(언더플로우)
        // byte b3 = 128; 해당 표현범위보다 크면(오버플로우)
        char c1 = 'k';
        //char c2 = -1;   // 언더플로우
        //char c3 = 65536;    // 오버플로우
        short s1 = 365;
        //short s2 = -32769;    // 언더플로우
        //short s3 = 32768;    // 오버플로우
        //int i1 = ;
        //int i2 = 2147483647;  // 언더플로우
        //int i3 = ;  // 오버플로우
    }
}
