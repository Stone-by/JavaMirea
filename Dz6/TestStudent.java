import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        int a=0;
        int b=9999;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Student[] mas = new Student[number];
        for(int i=0;i<number;i++){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int random_number = a + (int) (Math.random() * b);
            mas[i] = new Student(name,random_number);
        }
        System.out.println("\nUnsort mas");
        for(int i=0;i<number;i++){
            System.out.println(mas[i].toString());
        }
        Arrays.sort(mas);
        System.out.println("Sort mas");
        for(int i=0;i<number;i++){
            System.out.println(mas[i].toString());
        }
    }
}
