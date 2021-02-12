package ikbo081905;

public class Work09 {
    public static int foo(int a, int b){
        if (a - b == 1) {
            return 1;
        }
        if(a==b){
            return 2;
        }
        if(a<b){
            return a+b;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a=1;
        int b=5;
        System.out.println(foo(a,b));
    }
}
