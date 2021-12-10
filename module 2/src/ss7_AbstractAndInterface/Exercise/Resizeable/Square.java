package ss7_AbstractAndInterface.Exercise.Resizeable;

import ss7_AbstractAndInterface.Exercise.Resizeable.Shape;

public class Square extends Shape {
    private double side = 2.0;

    public Square() {

    }

    public Square(double side) {
      this.side = side;

    }

    public Square(double side, String color, boolean filled) {
        super( color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side* side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = this.side *(percent/100);

    }
    
}
