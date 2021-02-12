package ikbo081908;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        WaitList a1 = new BoundedWaitList(5);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        System.out.print(a1.content+"mas correct\n");
        WaitList a2 = new BoundedWaitList(5);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        a1.add(1);
        System.out.print(a1.content+"mas uncorrect\n");
        WaitList a3 = new UnfairWaitList();
        a3.content.add(1);
        a3.content.add(2);
        a3.content.add(3);
        System.out.print(a3.content+"mas not remove\n");
        a3.content.remove(2);
        System.out.print(a3.content+"mas remove\n");
        WaitList a4 = new WaitList();
        a4.content.add(1);
        a4.content.add(2);
        a4.content.add(2);
        a4.content.add(2);
        a4.content.add(3);
        System.out.print(a4.content+"mas\n");
        a4.content.remove();
        System.out.print(a4.content+"mas\n");
        System.out.print(a4.content.contains(3)+"contains\n");
        List a5 = new ArrayList();
        a5.add(2);
        a5.add(2);
        a5.add(2);
        a5.add(3);
        System.out.print(a4.content.containsAll(a5)+"containsAll\n");
        System.out.print(a4.content.isEmpty()+"isEmpty\n");

    }
}
