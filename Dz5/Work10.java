package ikbo081905;

public class Work10 {
    public static int foo(int a){
        if(a<=9){
            System.out.printf ("%s", a%10, "");
            return a;
        }
        else {
            System.out.printf (a%10+"");
            return foo(a / 10);
        }
    }
    public static void main(String[] args) {
        int a=5412;
        foo(a);
    }
}
