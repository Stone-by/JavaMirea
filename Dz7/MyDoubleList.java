package ikbo081907;


import java.util.ArrayList;
import java.util.List;

public class MyDoubleList {
        List<Double> a1 = new ArrayList<>();
        List<Double> a2 = new ArrayList<>();
    public void set(){
        for(int i=0;i<5;i++){
            double a = 0 + (int) (Math.random() * 9);
            a1.add(a);
        }
        for(int i=0;i<5;i++){
            double a = 0 + (int) (Math.random() * 9);
            a2.add(a);
        }
    }
    public void print(){
        System.out.print(a1);
        System.out.print("\n");
        System.out.print(a2);
    }
}
