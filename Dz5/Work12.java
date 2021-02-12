package ikbo081905;

import java.util.Scanner;
import java.util.Vector;

public class Work12 {
    public static int[] mas= new int[99999];
    public static int i = 0;
    public static int foo(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a==0){
            for(int j=0;j<i;j++){
                System.out.printf(mas[j]+" ");
            }
            return 0;
        }
        else{
            if(a%2==0){
                mas[i]=a;
                i++;
                return foo();
            }
            else{
                return foo();
            }
        }
    }
    public static void main(String[] args) {
        foo();
    }
}
