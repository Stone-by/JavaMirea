package ikbo081907;
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack {
    int sum1=0,sum2=0;
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    public void Setter(){
        for(int i=0;i<5;i++){
            stack1.push(0 + (int) (Math.random() * 9));
            stack2.push(0 + (int) (Math.random() * 9));
        }
    }
    public void Print(){
        System.out.print(stack1);
        System.out.print("\n");
        System.out.print(stack2);
    }
/*    public void fuse(){
        if(sum1>sum2){
            System.out.print("First "+sum1);
        }
        if(sum2>sum1){
            System.out.print("Second "+sum2);
        }
        if(sum1==sum2){
            System.out.print("botva");
        }
    }*/
}


