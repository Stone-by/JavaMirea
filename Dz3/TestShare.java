package ikbo081903;

public class TestShare {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", false, 5.5); // Через шаблон создаем треугольк
        System.out.println(s1); // возвращаем значения треугольника
        System.out.println(s1.getArea()); // получаем площадь
        System.out.println(s1.getPerimeter()); // а тут периметр
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); мы не можем обратится к радиусу из шаблона
        Circle c1 = (Circle)s1; // создаем треугольник по шаблону созданного треугольника
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); нельзя создать объект абстрактного класса
        Shape s3 = new Restangle("RED", false, 1.0, 2.0); // создаем через шаблон прямоугольник
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); мы не можем обратится к длине из шаблона
        Restangle r1 = (Restangle)s3; // создаем по шаблону прямоугольника еще один прямоугольник
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // создаем по шаблону квадрата еще один квадрат
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); мы не можем обратится к стороне из шаблона

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Restangle r2 = (Restangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); мы не можем обратится к стороне из прямоугольника
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
