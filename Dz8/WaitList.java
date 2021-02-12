package ikbo081908;

import org.w3c.dom.Element;

import java.util.Collection;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements EWaitList<E>{
    protected ConcurrentLinkedDeque<E> content;

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    public WaitList(){
        content = new ConcurrentLinkedDeque<>();
    }

    public WaitList(Collection <E> c){
        content = new ConcurrentLinkedDeque<>(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
