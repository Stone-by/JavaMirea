package MyFac;

public class FunC implements MyChair{
    @Override
    public void createChair() {
        System.out.println("Создался функциональный стул!");
    }

    @Override
    public void sitChair() {
        System.out.println("Вы сидите на нем!");
    }
}
