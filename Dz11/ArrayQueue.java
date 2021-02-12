package IKBO0819;

import java.util.ArrayList;

public class ArrayQueue {
    private ArrayList<Integer> array;

    ArrayQueue(ArrayList<Integer> array)
    {
        this.array = array;
    }

    public boolean enqueue (Integer n)
    {
        return array.add(n);
    }

    public Integer element()
    {
        return array.get(0);
    }

    public Integer dequeue ()
    {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int size()
    {
        return array.size();
    }

    public boolean isEmpty()
    {
        return array.isEmpty();
    }

    public void clear()
    {
        array.clear();
    }
}
