package ikbo081905;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Work11 {
    public static int sum=0;
    public static int foo(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if(a.intern()=="00"){
            System.out.println(sum);
            in.close();
            return 0;
        }
        if(a.intern()!="00"){
            int b = Integer.parseInt(a.intern());
            if(b==1){
                sum++;
            }
            return foo();
        }
        return 0;
    }
    public static void main(String[] args) {
        foo();
    }
}
