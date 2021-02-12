package MyFac;

public class VicC implements MyChair{
    @Override
    public void createChair() {
        System.out.println("Создался викторианский стул!");
    }

    @Override
    public void sitChair() {
        System.out.println("Вы сидите на нем!");
    }
}
