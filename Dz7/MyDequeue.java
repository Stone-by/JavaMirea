package ikbo081907;

import java.util.*;

public class MyDequeue {
    Deque<String> mas1 = new LinkedList<String>();
    Deque<String> mas2 = new LinkedList<String>();
    public void set(){
        for(int i=0;i<5;i++){
            int a = 0 + (int) (Math.random() * 9);
            String b = String.valueOf(a);
            mas1.addFirst(b);
        }
        for(int i=0;i<5;i++){
            int a = 0 + (int) (Math.random() * 9);
            String b = String.valueOf(a);
            mas2.addLast(b);
        }
    }
    public void print(){
        System.out.print(mas1);
        System.out.print("\n");
        System.out.print(mas2);
    }
}
