package IKBO0819;

import java.util.ArrayList;

public class ArrayQueueADT {
    public boolean enqueue (ArrayList<Integer> array, Integer n)
    {
        return array.add(n);
    }

    public Integer element(ArrayList<Integer> array)
    {
        return array.get(0);
    }

    public Integer dequeue (ArrayList<Integer> array)
    {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int size(ArrayList<Integer> array)
    {
        return array.size();
    }

    public boolean isEmpty(ArrayList<Integer> array)
    {
        return array.isEmpty();
    }

    public void clear(ArrayList<Integer> array)
    {
        array.clear();
    }
}
