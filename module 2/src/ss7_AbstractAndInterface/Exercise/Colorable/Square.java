package ss7_AbstractAndInterface.Exercise.Colorable;

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
    public void HowToColor() {
        System.out.println("red");
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square.HowToColor();
        System.out.println(square);


    }
}
