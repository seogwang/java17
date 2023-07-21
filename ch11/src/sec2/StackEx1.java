package sec2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        Stack<String> st1 = new Stack<>();
        st1.push("0");
        st1.push("1");
        st1.push("2");
        st1.push("4");
        st1.push("8");
        System.out.println(st1);

        st1.pop(); // 8 제거
        st1.pop(); // 4 제거
        System.out.println(st1);

        Queue<String> que = new LinkedList<>();
        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("4");
        que.offer("8");

        System.out.println(que);
        que.poll();
        que.poll();
        System.out.println(que);
    }
}
