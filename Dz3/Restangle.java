package ikbo081903;

public class Restangle extends Shape{
    protected double width;
    protected double length;

    public Restangle() {
        this.Filled = false;
        this.Color = "blue";
        this.length = 5.0;
        this.width = 4.0;
    }

    public Restangle(double width, double length) {
        this.Filled = false;
        this.Color = "blue";
        this.width = width;
        this.length = length;
    }

    public Restangle(String color, boolean filled, double width, double length) {
        Filled = filled;
        Color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
