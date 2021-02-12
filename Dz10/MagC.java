package MyFac;

public class MagC implements MyChair{
    @Override
    public void createChair() {
        System.out.println("Создался магический стул!");
    }

    @Override
    public void sitChair() {
        System.out.println("Вы сидите на нем!");
    }
}
