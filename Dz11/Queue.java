package IKBO0819;

public interface Queue {
    boolean enqueue(int n);
    int element();
    int dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
