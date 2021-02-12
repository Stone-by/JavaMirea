import java.util.*;

public class SortingStudentsByGPATest {
    public static void main(String[] args) {
        int a=0;
        int b=100;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        List<SortingStudentsByGPA> list = new ArrayList<SortingStudentsByGPA>();
        for(int i=0;i<number;i++){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int random_number = a + (int) (Math.random() * b);
            list.add(i,new SortingStudentsByGPA(random_number,name));
        }
        System.out.println("\nUnsort mas");
        System.out.println(list.toString());
        Comparator<SortingStudentsByGPA> comparator = Comparator.comparing(obj -> obj.getMark());
        Collections.sort(list,comparator.reversed());
        System.out.println("Sort mas");
        System.out.println(list.toString());
    }
}
