package MyFac;

public class SimpleChairFuc {
    public MyChair createChair(ChairType type){
        MyChair chair = null;

        switch (type){
            case FUN:
                chair = new FunC();
                break;
            case MAG:
                chair = new MagC();
                break;
            case VIC:
                chair = new VicC();
                break;
        }
        return chair;
    }
}
