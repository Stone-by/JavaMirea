import java.util.*;

public class TwoListTest {
    public static void main(String[] args) {
        int a=0;
        int b=100;
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        List<SortingStudentsByGPA> list1 = new ArrayList<SortingStudentsByGPA>();
        for(int i=0;i<number1;i++){
            Scanner sc1 = new Scanner(System.in);
            String name1 = sc1.nextLine();
            int random_number1 = a + (int) (Math.random() * b);
            list1.add(i,new SortingStudentsByGPA(random_number1,name1));
        }
        Comparator<SortingStudentsByGPA> comparator1 = Comparator.comparing(obj -> obj.getMark());
        Collections.sort(list1,comparator1);
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();
        List<SortingStudentsByGPA> list2 = new ArrayList<SortingStudentsByGPA>();
        for(int i=0;i<number2;i++){
            Scanner sc2 = new Scanner(System.in);
            String name2 = sc2.nextLine();
            int random_number2 = a + (int) (Math.random() * b);
            list1.add(i,new SortingStudentsByGPA(random_number2,name2));
        }
        Comparator<SortingStudentsByGPA> comparator2 = Comparator.comparing(obj -> obj.getMark());
        Collections.sort(list2,comparator2);
        List<SortingStudentsByGPA> list3 = new ArrayList<SortingStudentsByGPA>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("\nUnsort mas3");
        System.out.println(list3.toString());
        Comparator<SortingStudentsByGPA> comparator3 = Comparator.comparing(obj -> obj.getMark());
        Collections.sort(list3,comparator3);
        System.out.println("Sort mas3");
        System.out.println(list3.toString());
    }
}
