package Video_questions.DS.LinkedList.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class inbuiltexample {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(12);
        System.out.println(deque.removeFirst());
        System.out.println(deque);
    }
}
