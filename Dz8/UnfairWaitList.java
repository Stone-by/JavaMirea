package ikbo081908;

import javax.swing.text.Element;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList(){

    }

    public void remove(E element){
        content.remove(element);
    }

    public void moveToBack(E element){
        if(this.content.remove(element)){
            content.add(element);
        }
    }
}
