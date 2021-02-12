package MyFac;

public class ShopChair {
    private final SimpleChairFuc chairFuc;

    public ShopChair(SimpleChairFuc chairFuc){
        this.chairFuc = chairFuc;
    }

    public MyChair orderMyChair(ChairType type){
        MyChair chair = chairFuc.createChair(type);

        chair.createChair();
        chair.sitChair();

        return chair;
    }
}
