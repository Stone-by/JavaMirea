package ikbo081907;

public class Cart {
    private int mas1[] = new int[5];
    private int mas2[] = new int[5];
    private int sum1=0;
    private int sum2=0;

    public Cart() {
        int a=0;
        int b=9;
        for(int i=0;i<5;i++) {
            mas1[i] = a + (int) (Math.random() * b);
            mas2[i] = a + (int) (Math.random() * b);
        }
    }
    public void print(){
        for(int i=0;i<5;i++) {
            System.out.print(mas1[i]+" ");
        }
        System.out.print("\n");
        for(int i=0;i<5;i++) {
            System.out.print(mas2[i]+" ");
        }
    }
    public void fuse(){
        for(int i=0;i<5;i++) {
            if(mas1[i]==9&&mas2[i]==0){
                sum2++;
                continue;
            }
            if(mas1[i]==0&&mas2[i]==9){
                sum2++;
                continue;
            }
            if(mas1[i]>mas2[i]){
                sum1++;
                continue;
            }
            if(mas2[i]>mas1[i]){
                sum2++;
                continue;
            }
        }
        System.out.print("\n");
        if(sum1>sum2){
            System.out.print("First "+sum1);
        }
        if(sum2>sum1){
            System.out.print("Second "+sum2);
        }
        if(sum1==sum2){
            System.out.print("botva");
        }
    }
}
