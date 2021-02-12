import java.lang.*;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return (this.id - o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


