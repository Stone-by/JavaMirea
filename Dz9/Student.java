package ikbo08190902;

import java.lang.*;
import java.util.Comparator;
import java.util.HashMap;

public class Student implements Comparable<Student>{
    private int Ball;
    private String FIO;

    public Student(int ball, String FIO) {
        Ball = ball;
        this.FIO = FIO;
    }

    @Override
    public int compareTo(Student o) {
        return (this.Ball - o.Ball);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Ball=" + Ball +
                ", FIO='" + FIO + '\'' +
                '}';
    }
}
