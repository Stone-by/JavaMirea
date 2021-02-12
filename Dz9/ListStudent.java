package ikbo08190902;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.*;

public class ListStudent{
    private HashMap<String, Integer> Map = new HashMap<>();
    private Student[] arrayStudent;
    private int number;
    private String word;

    public void AddList(){
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        arrayStudent = new Student[number];
        for(int i=0;i<number;i++){
            Scanner sc1 = new Scanner(System.in);
            String fio = sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            int ball = sc2.nextInt();
            arrayStudent[i]=new Student(ball,fio);
            Map.put(fio,ball);
        }
    }

    public void SortBall(){
        Arrays.sort(arrayStudent);
    }

    public void Search(){
        Scanner sc = new Scanner(System.in);
        String fio = sc.nextLine();
        try {
            if(Map.containsKey(fio)){
                word="YES!";
            }
            else{
                throw new StudentNotFoundException("NO! "+fio);
            }
        }
        catch(StudentNotFoundException er){
            word="NO! "+fio;
        }
    }

    public String PrintWord(){
        return word;
    }

    @Override
    public String toString() {
        return "ListStudent{" +
                "arrayStudent=" + Arrays.toString(arrayStudent) +
                '}';
    }

}
