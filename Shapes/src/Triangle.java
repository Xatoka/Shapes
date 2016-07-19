public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        //TODO: implement computing of area!
        return 0;
    }
}
