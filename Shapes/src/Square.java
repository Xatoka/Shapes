public class Square implements Shape {
    private double side;
    private static final double NUMBER_OF_SIDES = 4;

    public Square(double side) {

        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * NUMBER_OF_SIDES;
    }
}
