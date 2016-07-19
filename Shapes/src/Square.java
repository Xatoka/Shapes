
public class Square implements Shape {
    private double side;
    private final double numberOfSide=4;

    public Square(double side) {

        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side*numberOfSide;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
