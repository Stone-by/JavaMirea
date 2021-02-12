package ikbo081908;

import javax.lang.model.element.Element;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element){
        if(this.content.size()<this.capacity){
            super.content.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
