package ikbo081908;

import org.w3c.dom.Element;

import java.util.Collection;

public interface EWaitList<E> {
    public void add(E element);
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection <E> c);
    public boolean isEmpty();
}
