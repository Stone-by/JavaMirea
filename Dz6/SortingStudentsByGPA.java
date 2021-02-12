import java.util.Comparator;

public class SortingStudentsByGPA {
    private String name;
    private int mark;


    public int getMark() {
        return mark;
    }


    public SortingStudentsByGPA(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
