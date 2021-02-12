package ikbo081907;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueue {
    Queue<String> a1 = new LinkedList<>();
    Queue<String> a2 = new LinkedList<>();
    public void set(){
        for(int i=0;i<5;i++){
            int a = 0 + (int) (Math.random() * 9);
            String b = String.valueOf(a);
            a1.offer(b);
        }
        for(int i=0;i<5;i++){
            int a = 0 + (int) (Math.random() * 9);
            String b = String.valueOf(a);
            a2.offer(b);
        }
    }
    public void print(){
        System.out.print(a1);
        System.out.print("\n");
        System.out.print(a2);
    }

}
