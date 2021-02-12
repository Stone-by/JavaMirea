package ikbo081903;

public class Square extends Restangle{
    protected double side;

    public Square() {
        this.Filled = false;
        this.Color = "blue";
        this.side = 4.0;
    }

    public Square(double side) {
        this.Filled = false;
        this.Color = "blue";
        this.side = side;
    }

    public Square(double side,boolean filled, String color) {
        Filled = filled;
        Color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
