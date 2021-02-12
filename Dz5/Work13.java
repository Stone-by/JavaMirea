package ikbo081905;

import java.util.Scanner;

public class Work13 {
    public static int[] mas= new int[99999];
    public static int i = 0;
    public static int foo(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a==0){
            for(int j=0;j<i;j+=2){
                System.out.printf(mas[j]+" ");
            }
            return 0;
        }
        else{
            mas[i]=a;
            i++;
            return foo();
        }
    }
    public static void main(String[] args) {
        foo();
    }
}
