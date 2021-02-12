package MyFac;

public class Test {
    public static void main(String[] args) {
        SimpleChairFuc fuc = new SimpleChairFuc();
        ShopChair a1 = new ShopChair(fuc);
        a1.orderMyChair(ChairType.VIC);
        //хз как именно правильно но смог только такое вроде пашет но у меня сомнения
    }
}
