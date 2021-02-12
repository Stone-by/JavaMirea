package ikbo081903;
import java.lang.*;
import java.math.*;

public abstract class Shape {
    protected String Color;
    protected boolean Filled;

    public Shape() {
        this.Filled = false;
        this.Color = "blue";
    }

    public Shape(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }

    public abstract  double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                ", Filled=" + Filled +
                '}';
    }
}
