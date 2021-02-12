package IKBO0819;

public class Main {
    public static void main(String[] ar)
    {
        ArrayQueueModule arr1 = new ArrayQueueModule();
        LinkedQueue arr2 = new LinkedQueue();

        for (int i = 0; i < 10; i++)
        {
            arr1.add(i);
            arr2.enqueue(i);
        }
        System.out.println(arr1);
        System.out.println(arr2);

        ArrayQueue arr3 = new ArrayQueue (arr1.GetArray());
        ArrayQueueADT arr4 = new ArrayQueueADT();

        System.out.println(arr3.element());

        arr2.dequeue();
        arr3.enqueue (12);
        System.out.println(arr3);
        arr4.enqueue(arr1.GetArray(), 11);
    }
}
